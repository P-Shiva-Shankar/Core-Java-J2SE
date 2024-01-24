package Assignmnet;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Principle Amount: ");
        int PAmout=in.nextInt();
        System.out.print("Enter The Annual Interest Rate: ");
        double rateOfInterest=in.nextDouble();
        System.out.print("Enter The Number Of Periods: ");
        int periods=in.nextInt();
        double temp=(rateOfInterest/100)+1;

        double compoundInterest=((PAmout*(Math.pow(temp,periods)))-PAmout);
        System.out.format("The Compound  Interest Is: %6.2f ",compoundInterest);
    }
}
