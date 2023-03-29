package Backtracking;

import java.sql.Array;
import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        //AllPaths("",board,0,0);
        AllPathsCount("",board,0,0,path,1);
    }
    public static void AllPaths(String p,boolean[][] maze,int r,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length-1){
            AllPaths(p+'D',maze,r + 1,c);
        }
        if(c < maze[0].length-1){
            AllPaths(p + 'R',maze,r,c+1);
        }
        if(r > 0){
            AllPaths(p + 'U',maze,r-1,c);
        }
        if(c > 0){
            AllPaths(p + 'L',maze,r,c-1);
        }
        maze[r][c] = true;
    }

    public static void AllPathsCount(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            AllPathsCount(p+'D',maze,r + 1,c,path,step+1);
        }
        if(c < maze[0].length-1){
            AllPathsCount(p + 'R',maze,r,c+1,path,step+1);
        }
        if(r > 0){
            AllPathsCount(p + 'U',maze,r-1,c,path,step+1);
        }
        if(c > 0){
            AllPathsCount(p + 'L',maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
