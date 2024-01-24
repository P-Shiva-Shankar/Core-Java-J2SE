package Assignmnet;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Total Number Of Runs Scored: ");
        int runs=in.nextInt();
        System.out.print("Enter The Total Number Of Matches Played: ");
        int maths=in.nextInt();
        System.out.print("Enter The Number Of Matches Which He was Not Out From"+maths+" : ");
        int notOutmatchs= in.nextInt();
        double Batting_Average= (double) runs /(maths-notOutmatchs);
        System.out.println("The Batting Average Is: "+Batting_Average);
    }
}
