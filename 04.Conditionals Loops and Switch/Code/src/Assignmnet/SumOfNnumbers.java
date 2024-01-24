package Assignmnet;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number At which You want sum: ");
        int n=in.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println("The Sum Of"+n+" Numbers Is: "+sum);
    }
}
