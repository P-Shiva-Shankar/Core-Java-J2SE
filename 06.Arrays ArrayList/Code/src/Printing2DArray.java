package ArraysArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Printing2DArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        //Input
        //For loop for row
        for (int row = 0; row < arr.length; row++) {
            //for loop for column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        //Output Type-1
        System.out.println("Normal type of printing");
        for (int row = 0; row < arr.length; row++) {
            //for loop for column
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        //Output Type-2 using toString Method
        System.out.println("Another type of printing using toString");
        for (int row = 0; row < arr.length; row++) {
            //for loop for column
            System.out.println(Arrays.toString(arr[row]));
        }
        //Output Type-3 using foreach
        System.out.println("Another type of printing using foreach");
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
