package Assignmnet;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter The Number At Which You Need Fibonacci Series: ");
        int num=in.nextInt();
        int count=2;
        int first=0;
        int second=1;
        while (count<=num)
        {
            int temp=second;
            second=second+first;
            first=temp;
            count++;
            System.out.print(second+" ");
        }
    }
}
