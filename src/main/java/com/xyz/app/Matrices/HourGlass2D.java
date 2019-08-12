package com.xyz.app.Matrices;

public class HourGlass2D {
    public static int hourglassSum(int[][] arr) {
        int result = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            if(row -1 >= 0 && row+1 <arr.length) {
                for (int column = 0; column < arr[row].length; column++) {
                    if(column -1 >= 0 && column+1 <arr.length) {
                        result = Math.max(arr[row-1][column] + arr[row][column] + arr[row+1][column] + arr[row+1][column-1]+ arr[row-1][column-1] + arr[row+1][column+1] + arr[row-1][column+1], result);
                    }
                }
            }
        }
        if(result ==Integer.MIN_VALUE) return 0;
        else return result;
    }

}
