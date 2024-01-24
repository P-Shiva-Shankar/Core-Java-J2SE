package Assignmnet;

import java.util.Scanner;

public class SumOfNegOddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sumOfNeg=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        while (true)
        {
            System.out.print("Enter The Number: ");
            int input=in.nextInt();
            if(input==0)
            {
                break;
            }
            if(input<0)
            {
                sumOfNeg+=input;
            } else if (input>0) {
                if(input%2==0)
                {
                    sumOfEven+=input;
                }
                else {
                    sumOfOdd+=input;
                }

            }
        }
        System.out.println("The Sum Of Negative Numbers: "+sumOfNeg);
        System.out.println("The Sum Of Positive Even numbers: "+sumOfEven);
        System.out.println("The Sum Of Positive Odd Numbers: "+sumOfOdd);
    }
}
