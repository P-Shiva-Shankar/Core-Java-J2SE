package ArraysArrayList;
import java.util.Scanner;
public class Input2DArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        //For loop for row
        for (int row = 0; row < arr.length; row++) {
            //for loop for column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
            System.out.println("Row "+row+" Inserted");
        }
    }
}

