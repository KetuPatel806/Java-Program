import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(400);
        list.add(400);
        list.add(4930);
        list.add(238);
        System.out.println(list);
        list.set(2,300);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
