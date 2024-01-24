package Assignmnet;

import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Side Length Of The Cube: ");
        int SideLength=in.nextInt();
        double TotalSurfaceArea=6*Math.pow(SideLength,2);
        System.out.println("The Total Surface Area Of The Cube Is : "+TotalSurfaceArea);
    }
}
