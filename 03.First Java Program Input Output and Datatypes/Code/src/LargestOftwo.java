//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestOftwo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=in.nextInt();
        System.out.print("Enter the second number: ");
        int num2=in.nextInt();
        if(num1>num2)
        {
            System.out.println("The number "+num1+" is greater");
        }
        else
        {
            System.out.println("The number "+num2+" is greater");
        }
    }
}
