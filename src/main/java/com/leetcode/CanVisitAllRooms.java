package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanVisitAllRooms {

    Set<Integer> set = new HashSet<>();

    public boolean canVistAllRooms(List<List<Integer>> rooms) {
        helper(rooms, 0);
        return set.size() == rooms.size();
    }


    private void helper(List<List<Integer>> rooms, int index) {
        if (set.contains(index))
            return;
        set.add(index);
        for (Integer i : rooms.get(index)) {
            helper(rooms, i);
        }
    }

    public boolean canVistAllRoomsV2(List<List<Integer>> rooms) {
        int len = rooms.size();
        int[] visted = new int[len];
        helperV2(rooms, 0, visted);
        for (int i : visted) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    private void helperV2(List<List<Integer>> rooms, int index, int[] visited) {
        if (visited[index] == 1) {
            return;
        }
        visited[index] = 1;
        for (Integer i : rooms.get(index)) {
            helperV2(rooms, i, visited);
        }
    }
}
