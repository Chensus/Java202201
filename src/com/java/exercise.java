
package com.java;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class exercise {

    public static void main(String[] args) {
        StringBuilder as = new StringBuilder("abc");
        as.delete(as.length() - 2, as.length());
        System.out.println(as.toString());
        Solution solution = new Solution();
        int[]time={22,0};
        int[][]clock ={{8,0}};
        System.out.println(solution.sleeptime(time, clock)[0]+"  "+solution.sleeptime(time, clock)[1]);



    }




}

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix.length == 0 || matrix[0].length == 0)
//            return false;
//        int begin, mid, end;
//        begin = mid = 0;
//        int len1 = matrix.length, len2 = matrix[0].length;
//        end = len1 * len2 - 1;
//        while (begin < end) {
//            mid = (begin + end) / 2;
//            if (matrix[mid / len2][mid % len2] < target)
//                begin = mid + 1;
//            else
//                end = mid;
//        }
//        return matrix[begin / len2][begin % len2] == target;
//    }
//}

//class Solution {
//    public int[] sleeptime(int[] time, int[][] clock) {
//        int getbed = time[0] * 60 + time[1];
//
//        if (clock.length == 1) {
//            int clockmin1 = clock[0][0] * 60 + clock[0][1];
//            int sleepmin1 = clockmin1 - getbed >= 0 ? clockmin1 - getbed : clockmin1 - getbed + 24 * 60;
//            return new int[]{sleepmin1 / 60, sleepmin1 % 60};
//        }
//        int[] clockmin = new int[clock.length];
//        int sleepmin =24*60;
//        for (int i = 0; i < clock.length; i++) {
//            clockmin[i] = clock[i][0] * 60 + clock[i][1];
//            sleepmin = Math.min(sleepmin,clockmin[i] - getbed >= 0 ? clockmin[i] - getbed : clockmin[i] - getbed + 24 * 60);
//        }
//        return new int[]{sleepmin / 60, sleepmin % 60};
//    }
//}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack=new ArrayDeque<Integer>();






    }
}