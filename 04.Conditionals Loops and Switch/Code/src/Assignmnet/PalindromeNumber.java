package Assignmnet;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=in.nextInt();
        int Orginial=number;

        int reverse=0;
        while (number!=0)
        {
            int rem=number%10;
            number/=10;
            reverse=reverse*10+rem;
        }

        if(reverse==Orginial)
        {
            System.out.println("The Number "+Orginial+" Is Palindrome");
        }
        else {
            System.out.println("The Number "+Orginial+" Is Not A Palindrome");
        }
    }
}
