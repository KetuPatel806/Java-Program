public class oddTimeDupli {
    public static void main(String[] args) {
        int[] arr ={2,2,4,2,7,7,8,7,8,8};
        System.out.println(duplicateNumber(arr));
    }
    public static int duplicateNumber(int[] arr){
        int unique = 0;
        for(int i=0;i<arr.length;i++){
            unique += unique | i;
        }
        return unique%3;
    }
}
