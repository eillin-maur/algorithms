/*
 * Дан массив целых чисел nums и целое число target, нужно вернуть пару индексов элементов массива, 
 * которые в сумме дают значение target.
 * Имеется только одно решение и один элемент нельзя использоваться дважды. 
 * Вернуть ответ в любом порядке.
 */


package TwoSum;

import java.util.Arrays;
import java.util.HashMap;


class Solution {
    // O(n2)
    private static int[] twoSumN2(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }
    // O(n)
    private static int[] twoSumN(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int[] indices = new int[2];

        for (int i=0; i<nums.length; i++) {
            int delta = target - nums[i];
            
            if (hashmap.containsKey(delta)) {
                indices[0] = i;
                indices[1] = hashmap.get(delta);
            }
            hashmap.put(nums[i], i);
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumN2(nums, target)));
        System.out.println(Arrays.toString(twoSumN(nums, target)));
        
    }
};
