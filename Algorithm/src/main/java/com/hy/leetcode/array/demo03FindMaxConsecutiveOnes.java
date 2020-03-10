package com.hy.leetcode.array;

/*
给定一个二进制数组， 计算其中最大连续1的个数。
 */
public class demo03FindMaxConsecutiveOnes {

    public static void main(String[] args) {

    }

    /**
     *
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int x : nums) {
            cur = x == 0 ? 0 : cur + 1;//不是0就+1
            max = Math.max(max, cur);
        }
        return max;
    }


}
