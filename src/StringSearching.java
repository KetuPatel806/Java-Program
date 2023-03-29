public class StringSearching {
    public static void main(String[] args) {
        String name = "zexity";
        char target = 't';
        System.out.println(stringSearch(name,target));
    }
    public static boolean stringSearch(String str,int target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
