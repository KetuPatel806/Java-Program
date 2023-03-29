package StringWithRecursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","23");
        System.out.println(padList("","23"));
        System.out.println(padCount("","23"));
    }
    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i=(digit-2)*3;i<=(digit*3)-4;i++){
            char ch = (char)('a' + i);
            pad(p + ch,up.substring(1));
        }
    }
    public static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit-2)*3;i<=(digit*3)-4;i++){
            char ch = (char)('a' + i);
            list.addAll(padList(p + ch,up.substring(1)));
        }
        return list;
    }

    public static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for(int i=(digit-2)*3;i<=(digit*3)-4;i++){
            char ch = (char)('a' + i);
            count = count + padCount(p + ch,up.substring(1));
        }
        return count;
    }
}
