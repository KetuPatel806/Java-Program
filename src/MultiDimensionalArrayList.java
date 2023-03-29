import java.util.*;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // add some Arraylist so we get output
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //input ArrayList
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
