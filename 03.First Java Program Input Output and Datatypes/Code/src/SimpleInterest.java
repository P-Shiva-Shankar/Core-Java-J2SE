//Write a program to input principal, time, and rate (P, T, R)
// from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p=in.nextInt();
        System.out.print("Enter the time : ");
        float t=in.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r=in.nextFloat();
        float si=(p*t*r)/100;
        System.out.println("The simple interest is : "+si);
    }
}
