package ArraysArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class InputArrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
//       Type-1
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
//       Type-2 by user input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
    }
}
