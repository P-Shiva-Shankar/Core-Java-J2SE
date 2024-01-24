import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Place at which u want an fibonacci Number: ");
        int num=in.nextInt();
        int first=0;
        int second=1;
        int count=2;
        while(count<=num)
        {
            int temp=second;
            second=second+first;
            first=temp;
            count++;
        }
        System.out.println(second);
    }
}
