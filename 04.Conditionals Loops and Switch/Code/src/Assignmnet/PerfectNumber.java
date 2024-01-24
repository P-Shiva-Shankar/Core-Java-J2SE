package Assignmnet;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=in.nextInt();
        int sum=0;
        for (int i = 1; i <number ; i++) {
            if(number%i==0)
            {
                sum+=i;
//                System.out.print(i+" ");
            }

        }
        if(sum==number)
        {
            System.out.println("The Number "+number+" Is Perfect Number");
        }
        else {
            System.out.println("The Number "+number+" Is Not Perfect Number");
        }
    }
}
