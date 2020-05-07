package com.sunkai.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author sunkai
 * @Date 2020/3/23 16:37
 * @Version 1.0
 **/
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int lastRemaining(int n, int m) {
        int flag = 0;
        for(int i=2;i <=n;i++){
            flag = (flag + m)%i;
        }
        return flag;
    }


    public static void main(String[] args) {
        int [][]mat = {{1,4,7,11,15},
                        {2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}};
        findNumberIn2DArray(mat,5);
    }
    public static String replaceSpaces(String S, int length) {
        String result = "";
        for(int i = 0 ; i < length ; i++){
            Character a = S.charAt(i);
            if(a == ' '){
                String b = "%20";
                result += b;
            }else{
                result += a;
            }
        }
        return result;
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0;
        int column = columns - 1;
        while(row < rows && column >= 0){
            int value = matrix[row][column];
            if(value == target){
                return true;
            }else if(value > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
