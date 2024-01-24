package Assignmnet;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=in.nextInt();
        int temp=number;
        int sum=0;
        while (number!=0)
        {
            int rem=number%10;
            sum+=rem;
            number=number/10;
        }
        System.out.println("The Sum Of Digits Of This Number "+temp+" Is: "+sum);
    }
}
