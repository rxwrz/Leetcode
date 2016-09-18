package com.leetcode;

import java.util.Arrays;

public class Q1_TwoSum {
    
    public static void main(String[] args) {
	Q1_TwoSum q1 = new Q1_TwoSum();
	int[] nums = new int[] { 3, 2, 4 };
	int target = 6;
	int[] index = new int[2];
	index = q1.twoSum(nums, target);
	System.out.println(index[0]);
	System.out.println(index[1]);
    }
    
    public int[] twoSum(int[] nums, int target) {
	int[] index = new int[2];
	for (int i = 0; i < nums.length; i++) {
	    for (int j = nums.length - 1; j > 0; j--) {
		if (nums[i] + nums[j] == target) {
		    index[0] = i;
		    index[1] = j;
		    return index;
		}
	    }
	}
	return index;
    }
    
}
