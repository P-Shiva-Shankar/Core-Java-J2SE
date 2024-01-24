package Assignmnet;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Price On The Liable Or Tag Of That Product: ");
        double listPrice=in.nextDouble();
        System.out.print("Enter The Selling Price Of The Product: ");
        double sellingPrice=in.nextDouble();
        double discount=(listPrice-sellingPrice)/sellingPrice*100;
        System.out.println("The Discount Of The Product is : "+discount+"%");
    }
}
