public class GFG {
    public static void main(String[] args) {
        System.out.println(counter(5,0));
    }
    public static int counter(int number,int count){
        if(number == 0){
            return count;
        }
        return counter(number-1,count+number);
    }
}
