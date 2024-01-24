package Assignmnet;

import java.util.Scanner;

public class FeatureInvestmentValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Present Investment Value: ");
        double presentValue=in.nextDouble();
        System.out.print("Enter The Rate Of Returns : ");
        double rate=in.nextDouble();
        System.out.print("Enter The Number Of Years: ");
        double time=in.nextDouble();
        double FeatureInv=presentValue*Math.pow((1+rate),time);
        System.out.println("The Feature Investment Value Is: "+FeatureInv);
    }
}
