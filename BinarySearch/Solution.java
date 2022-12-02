/*
 * Реализация бинарного поиска
 */

package BinarySearch;


class Solution {
    private static int BinarySearch(int[] arr, int num, int low, int high) {
        int mid_indice = low + ((high - low) / 2);

        if (low > high) {
            return -1;
        }

        int mid_value = arr[mid_indice];

        if (mid_value == num) {
            return mid_indice;
        } else if (mid_value > num) {
            return BinarySearch(arr, num, low, mid_indice - 1);
        } else {
            return BinarySearch(arr, num, mid_indice + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,2,3,4};
        System.out.println(BinarySearch(arr, -1, 0, arr.length-1));
    }
 }