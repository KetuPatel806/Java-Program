package Backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(countTheSum(3,3));
        printThePath("",3,3);
        System.out.println(savePath("",3,3));
        System.out.println(savePathDiagonal("",3,3));

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("",board,0,0);
    }
    public static int countTheSum(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int count = 0;
        count = count + countTheSum(r-1,c);
        count = count + countTheSum(r,c-1);
        return count;
    }
    public static void printThePath(String p,int r,int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            printThePath(p+'R' ,r-1,c);
        }
        if(c > 1){
            printThePath(p + 'D',r,c-1);
        }
    }

    public static ArrayList<String> savePath(String p,int r,int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(savePath(p + 'R',r-1,c));
        }
        if(c > 1){
            ans.addAll(savePath(p + 'D',r,c-1));
        }
        return ans;

    }
    public static ArrayList<String> savePathDiagonal(String p,int r,int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1){
            ans.addAll(savePathDiagonal(p + 'D',r-1,c-1));
        }
        if(r > 1){
            ans.addAll(savePathDiagonal(p + 'V',r-1,c));
        }
        if(c > 1){
            ans.addAll(savePathDiagonal(p + 'H',r,c-1));
        }
        return ans;

    }
    public static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathRestriction(p + 'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathRestriction(p + 'R',maze,r,c+1);
        }
    }

}
