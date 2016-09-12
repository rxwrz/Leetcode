package com.leetcode;

import java.util.Arrays;


public class P189 {
	/**
	 * Rotate an array of n elements to the right by k steps.
     * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
     * is rotated to [5,6,7,1,2,3,4].
	 * @param nums
	 * @param k
	 */
    public void rotate(int[] nums, int k) {
    	int size = nums.length;
    	k=k%size;
    	if (k==0) {
    		return;
    	}
    	int[] fore = new int[k];
    	int[] after = new int[size-k];
    	//split the arrays to be two, fore and after
    	fore = Arrays.copyOfRange(nums, size-k, size);
    	after = Arrays.copyOfRange(nums, 0, size-k);
    	/**
    	 * combine the two arrays
    	 */		
    	System.arraycopy(fore,0,nums,0,k);
    	System.arraycopy(after,0,nums,k,size-k);
    }
	
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7};
		int[] array2 = new int[7];
		System.arraycopy(array,0,array2,0,7);
		P189 leet189 = new P189();
		leet189.rotate(array,8);
	}
}