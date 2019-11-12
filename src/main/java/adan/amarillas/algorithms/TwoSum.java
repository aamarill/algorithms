/*
  Problem statement:
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

package adan.amarillas.algorithms;

import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (indices.containsKey(complement)) {
        return new int[]{i, indices.get(complement)};
      }
      indices.put(nums[i], i);
    }

    throw new IllegalArgumentException("No two sum solution in input array");
  }
}
