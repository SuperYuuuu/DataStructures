package com.hy.leetcode.array;

import java.util.LinkedList;

/*
改变矩阵维度
    Input:
    nums=
    [[1,2],
     [3,4]]
    r=1,c=4

    output:
    [[1,2,3,4]]

    Explanation:
    The row-traversing of nums is[1,2,3,4].The new reshape matrix is a 1*4 matrix,
    fill it row by using the previous list.
 */
public class demo02MatrixReshape {

    public static void main(String[] args) {

    }

    /**
     *方法三：
     *  取余，取模
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int m=nums.length,n=nums[0].length;//原数组的位维度
        if (m * n != r * c) {
            return nums;
        }
        int[][] reshapedNums = new int[r][c];
        int index=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedNums[i][j] = nums[index / n][index % n];
                index++;
            }
        }
        return reshapedNums;
    }

    /**
     *方法一：
     * 使用队列：
     *  步骤：
     *  1.先遍历元祖存储进队列中
     *  2.再遍历将队列中数取出添加入新的维度的数组中
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape2(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    /**
     * 方法二：
     *  不使用队列
     *  直接存入到新的维度的数组中
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape3(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}
