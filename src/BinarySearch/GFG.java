package BinarySearch;

public class GFG {
    public static void main(String[] args) {
        int[] a ={1, 5, 10, 20, 40, 80};
        int[] b ={6, 7, 20, 80, 100};
        int[] c ={3, 4, 15, 20, 30, 70, 80, 120};
        getNumber(a,b,c);

    }
    static void getNumber(int[] a, int[] b,int[] c){
        int i=0;
        int j=0;
        int k=0;
        while( i<a.length &&  j<b.length && k<c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                System.out.println(a[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < c[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
}
