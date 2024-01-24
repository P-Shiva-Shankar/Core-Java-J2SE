package Assignmnet;

import java.util.Scanner;

public class ElectrictyBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number Of Units Consumed Per Month: ");
        double consumedUnits=in.nextDouble();
        double totalAmount=0;

        if(consumedUnits>=100)
        {
            totalAmount+=100*4.10;
            totalAmount+=(consumedUnits-100)*7.15;
        }
        System.out.println("The Total Amount Of Electricity Bill "+totalAmount);
    }

}
