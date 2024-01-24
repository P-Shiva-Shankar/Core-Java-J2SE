package Assignmnet;

import java.util.Scanner;

public class CommissonPercentage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Sales Price: ");
        double salesPrice=in.nextDouble();
        double CommissionPer=(salesPrice*2.5)/100;
        System.out.println("The Commission Percentage For The Given Sales Price is : "+CommissionPer);
    }
}
