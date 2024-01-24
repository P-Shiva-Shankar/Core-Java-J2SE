package Assignmnet;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number1 : ");
        int number1=in.nextInt();
        System.out.print("Enter The Number2 : ");
        int number2=in.nextInt();
        int Addition=number1+number2;
        System.out.println("The Addition Of Two Numbers Is : "+Addition);
    }
}
