package Assignmnet;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The N Value: ");
        int n=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter The Integer Value: ");
            int input=in.nextInt();
            sum+=input;
        }
        int average=sum/n;
        System.out.println("The Of "+n+" Numbers Is: "+average);

    }
}
