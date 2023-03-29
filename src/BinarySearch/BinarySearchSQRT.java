package BinarySearch;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int x = 40;
        int p = 3;

        System.out.printf("%.3f",sqrt(x,p));

    }
    public static double sqrt(int x,int p){
        int s = 0;
        int e = x;
        double root = 0.0;
        while(s<=e){
            int m = s +(e-s)/2;
            if(m * m == x){
                return m;
            } else if (m * m > x) {
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        double incr = 0.1;
        for(int i = 0;i<p;i++){
            while(root * root <= x){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
