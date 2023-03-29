package BinarySearch;

import java.util.Arrays;

public class TWODRBS {
    public static void main(String[] args) {
        int[][] matrix ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,35,39,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int column = matrix.length-1;
        //for 2D Binary Search always Row = 0 & Column = length-1
        //in this binary search we always going to reduce search space
        //so we doing 3-cases
        //Case - 1 = target == matrix[row][column]
        //then directly return the answer
        /* Case - 2 = matrix[row][column] < target
        then we have to reduce a space becz as we know that element is smaller than target
        so we found that row going to reduce by row++
           Case - 3 = matrix[row][column] > target
           then we have to reduce a space becz as we know that element is larger than target
           so we found that column going to reduce by column--
         */
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            }
            else if(matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
