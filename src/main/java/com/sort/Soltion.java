package com.sort;

import java.util.Arrays;

/**
 * @author wt
 * @date 2021/12/4
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.sort </li>
 * </ul>
 */
public class Soltion {

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + ",");
        }

    }

    /**
     * 直接插入排序
     *
     * @param a
     */
    public static void InsertSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        // 步长可以自己定义,一般指定为数组长度的一半
        for (int i = array.length / 2; i > 0; i = i / 2) {
            // 从下标等于步长的位置开始排序
            for (int j = i; j < array.length; j++) {
                // 如果后面的数比前面的数小,则交换位置
                while (j - i >= 0 && array[j] < array[j - i]) {
                    int temp = array[j];
                    array[j] = array[j - i];
                    array[j - i] = temp;
                    // 注意,交换完位置后,还要比较交换完位置的array[j]是否比相距指定步长的array[j-i]小,如果是,则继续交换位置。
                    // 基于这个原因,不能使用if来判断,否则只能交换一次位置
                    j = j - i;
                }
            }
        }
        System.err.print(Arrays.toString(array));
        return array;
    }

    /**
     * 希尔排序
     *
     * @param array
     */
    public void sort(int array[]) {
        int temp;
        for (int k = array.length / 2; k > 0; k /= 2) {
            for (int i = k; i < array.length; i++) {
                for (int j = i; j >= k; j -= k) {
                    if (array[j - k] > array[j]) {
                        temp = array[j - k];
                        array[j - k] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        System.err.print(Arrays.toString(array));
    }

    /**
     * 冒泡排序
     */
    public void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.err.print(Arrays.toString(array));
    }

    /**
     * 快速排序
     */
    public static void quickSort(int[] a, int left, int right) {
        int i, j, t;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        int temp = a[left];
        while (i < j) {
            //找出右侧小于temp的值
            while (temp <= a[j] && i < j) {
                j--;
            }
            while (temp >= a[i] && i > j) {
                i--;
            }
            if (i < j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[left] = a[i];
        a[right] = a[j];
        quickSort(a, left, j - 1);
        quickSort(a, j + 1, right);
    }
}