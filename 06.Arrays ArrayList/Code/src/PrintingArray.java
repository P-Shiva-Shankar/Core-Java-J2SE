package ArraysArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PrintingArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        //Normal Way of Printing
        System.out.print("Normal Way : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        //Another way of Printing
        System.out.println();
        System.out.print("Another way using foreach : ");
        for (int a:arr)
        {
            System.out.print(a+" ");
        }
        //Best Way of Printing with less numbers of line
        System.out.println();
        System.out.println("Best Way: "+Arrays.toString(arr));
    }
}
