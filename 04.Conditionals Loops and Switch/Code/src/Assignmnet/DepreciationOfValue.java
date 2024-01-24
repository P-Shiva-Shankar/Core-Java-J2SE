package Assignmnet;


import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Cost Of Asset: ");
        double costAsset=in.nextDouble();
        System.out.print("Enter The Salvage Value: ");
        double salvageVale=in.nextDouble();
        System.out.print("Enter The UseFul Life Of Asset: ");
        int Assest=in.nextInt();
        double deprecitationValue = (costAsset - salvageVale) / Assest;
        System.out.println("The Deprecation Value Of Asset Is: "+deprecitationValue);

    }
}
