package StringWithRecursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutationOfString("","abc");
        ArrayList<String> ans = permutationOfStringList("","abc");
        System.out.println(ans);
    }
    public static void permutationOfString(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutationOfString(s+ch+e,up.substring(1));
        }
    }

    public static ArrayList<String> permutationOfStringList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<=p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            ans.addAll(permutationOfStringList(s+ch+e,up.substring(1)));
        }
        return ans;
    }
}
