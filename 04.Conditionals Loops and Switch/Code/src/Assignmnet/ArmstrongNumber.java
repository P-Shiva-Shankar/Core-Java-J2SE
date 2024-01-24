package Assignmnet;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The 3 Digit Number: ");
        int num=in.nextInt();
        int temp=num;
        int rem=0;
        int sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(sum==temp)
        {
                System.out.println(sum+" is Armstrong number");
        }
        else
        {
            System.out.println(sum+" is Not A Armstrong number");
        }

    }
}
