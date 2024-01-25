package ArraysArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class SwappingArrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("The Given Array : "+Arrays.toString(arr));
        System.out.print("Enter the first index: ");
        int index1=in.nextInt();
        System.out.print("Enter the second index: ");
        int index2=in.nextInt();
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("The Array after swapping: "+Arrays.toString(arr));
    }
}
