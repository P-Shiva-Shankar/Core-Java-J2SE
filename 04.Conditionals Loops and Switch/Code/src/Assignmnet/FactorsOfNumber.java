package Assignmnet;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Positive Number: ");
        int number=in.nextInt();
        for (int i = 1; i <=number ; i++) {
            if(number%i==0)
            {
                System.out.print(i+" ");
            }

        }
    }
}
