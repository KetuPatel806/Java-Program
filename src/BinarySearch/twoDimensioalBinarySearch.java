package BinarySearch;

import java.util.Arrays;

public class twoDimensioalBinarySearch {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3,4},
                {5,6,7,8}};

        System.out.println(Arrays.toString(search(matrix,2)));
        }

    static int[] search(int[][] matrix ,int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 0) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        else if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        else if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }
        else if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }
        else if (target >= matrix[rStart][cMid + 1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }
        else if (target >= matrix[rStart + 1][cMid + 1]) {
            return binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }
        return new int[]{-1,-1};
    }

    static int[] binarySearch(int[][] matrix , int target,int row,int cStart,int cEnd){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
