package com.hy.leetcode.array;

/*
把数组中的0移动到末尾
 */

import java.util.Arrays;

public class demo01MoveZeroes {

    public static void main(String[] args) {
        int[] num1 = {0, 1, 0, 3, 12};
        moveZeroes(num1);
        System.out.println(Arrays.toString(num1));
    }

    /**
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }

    /**
     *
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        for(int i=0,count=0;i<nums.length;i++){
            if(nums[i] != 0){
                //执行替换操作
                if(count != i){
                    nums[count] = nums[i];
                    nums[i] = 0;
                }
                count++;
            }
        }
    }
}

