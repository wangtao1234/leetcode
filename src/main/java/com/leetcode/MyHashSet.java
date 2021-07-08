package com.leetcode;


/**
 * 自定义hashSet
 */
public class MyHashSet {

    private boolean[] hashSet;

    public MyHashSet() {
        this.hashSet = new boolean[10000001];
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    public boolean contains(int key) {
        return hashSet[key];
    }


}
