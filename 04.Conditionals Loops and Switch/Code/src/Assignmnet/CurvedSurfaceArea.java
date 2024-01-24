package Assignmnet;

import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double pi=3.142;
        System.out.print("Enter The Radius Of Cylinder: ");
        double Radius=in.nextInt();
        System.out.print("Enter The Height Of Cyclinder: ");
        double Height=in.nextInt();
        double CurvedSurfaceArea=2*pi*Radius*Height;
        System.out.print("The Area Of Curved Surface Of Cylinder: "+CurvedSurfaceArea);
    }
}
