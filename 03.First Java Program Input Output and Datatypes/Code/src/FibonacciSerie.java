//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class FibonacciSerie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        int first=0;
        int second=1;
        int count=2;
        System.out.print(first+" "+second+" ");
        while(count<=num)
        {
            int temp=second;
            second=second+first;
            first=temp;
            count++;
            System.out.print(second+" ");
        }
    }
}
