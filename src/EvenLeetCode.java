public class EvenLeetCode {
    public static void main(String[] args) {
        int[] arr ={12,345,2,6,7896};
        System.out.println(evenTerms(arr));

    }
    static int evenTerms(int[] arr){
        int count =0;

        for(int num=0;num< arr.length-1;num++){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigit = evenDigit(num);
        return numberOfDigit % 2 == 0;
    }
    static int evenDigit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}
