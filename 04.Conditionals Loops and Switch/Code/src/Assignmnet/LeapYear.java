package Assignmnet;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Year: ");
        int year=in.nextInt();
    if(year%100==0 && year%400==0)
    {
        System.out.println("The Year "+year+" Is Leap Year");
    }
    else {
        System.out.println("The Year "+year+" Is Not A Leap Year");
    }


    }
}
