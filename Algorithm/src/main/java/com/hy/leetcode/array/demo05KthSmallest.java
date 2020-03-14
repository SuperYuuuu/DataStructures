package com.hy.leetcode.array;

/*
378
给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
请注意，它是排序后的第k小元素，而不是第k个元素。

示例:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

返回 13。
说明:
你可以假设 k 的值永远是有效的, 1 ≤ k ≤ n2 。
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class demo05KthSmallest {

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(kthSmallest(matrix, 8));
    }

    /**
     * 二分查找解法:
     *
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n && matrix[i][j] <= mid; j++) {
                    cnt++;
                }
            }
            if (cnt < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

    /**
     * 暴力法求解：
     *
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest2(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[] matrix2 = new int[m * n];
        int count=0;
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                matrix2[count] = matrix[i][j];
                count++;
            }
        }
        Arrays.sort(matrix2);
        return matrix2[k - 1];
    }

    /**
     *推排序方法：
     *
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest3(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for (int j = 0; j < n; j++) {
            pq.offer(new Tuple(0, j, matrix[0][j]));
        }
        for (int i = 0; i < k - 1; i++) {
            Tuple t = pq.poll();
            if (t.x == m - 1) {
                continue;
            }
            pq.offer(new Tuple(t.x + 1, t.y, matrix[t.x + 1][t.y]));
        }
        return pq.poll().val;
    }


    static class Tuple implements Comparable<Tuple> {
        int x,y,val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        public int compareTo(Tuple o) {
            return this.val-o.val;
        }
    }

}
