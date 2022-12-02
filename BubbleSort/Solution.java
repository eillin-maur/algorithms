/*
 * Реализовать пузырьковую сортировку
 */

// [4,2,3,0]
// (2,4) - [2,4,3,0] - (0,1)
// (2,3) - [2,4,3,0] - (0,2)
// (0,2) - [0,4,3,2] - (0,3)
// (3,4) - [0,3,4,2] - (1,2)
// (2,3) - [0,2,4,3] - (1,3)
// (3,4) - [0,2,3,4] - (2,3)

package BubbleSort;

import java.util.Arrays;


class Solution {
    private static int[] BubbleSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4,2,3,0,10,9,3,0,-10};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
};
