import java.util.Scanner;
public class MultiDimensionArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col< matrix.length;col++){
                matrix[row][col] = sc.nextInt();
            }
        }
        for (int[] ints : matrix) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }

    }
}
