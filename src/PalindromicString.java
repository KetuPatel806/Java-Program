import java.util.Locale;

public class PalindromicString {
    public static void main(String[] args) {
        String str = "AmanaplanacanalPanama";
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
