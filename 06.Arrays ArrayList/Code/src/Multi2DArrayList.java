
import java.util.ArrayList;
import java.util.Scanner;
public class Multi2DArrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Declaring the 2D ArrayList
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //Initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //adding the elemnts
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        //Printing 2D ArrayList
        System.out.println(list);
    }
}
