
import java.util.Arrays;
import java.util.Scanner;
public class MaxValueArrayRange {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={1,4,8,7,9,4,5};
        System.out.println("The given array list: "+ Arrays.toString(arr));
        System.out.print("Enter the starting index: ");
        int start=in.nextInt();
        System.out.print("Enter the ending index: ");
        int end=in.nextInt();
        int max=arr[start];
        for (int i = start; i <end ; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum value between this "+start+" & "+end+ " range: "+max);
    }
}
