package ArraysArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class PrintArrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        //Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//      Printing Type-1 Direct form
        System.out.println(list);
//       Type-2 using index
        // pass index here, list[index] syntax will not work here
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
