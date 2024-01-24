/*
Take integer inputs till the user enters 0 and print the sum of all numbers
        (HINT: while loop)*/
package Assignmnet;

import java.util.Scanner;

public class WhileLoopTermination {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean check=true;
        int max=0;
        while (check)
        {
            System.out.print("Enter The Number: ");
            int number=in.nextInt();
            if(number==0)
            {
                check=false;
            }
            else
            {
                if(number>max)
                {
                 max=number;
                }
            }
        }
        System.out.println("The Sum Of All Numbers: "+max);
    }

}
