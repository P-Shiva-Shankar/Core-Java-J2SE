package Assignmnet;

import java.util.Scanner;

public class DistanceOf2Points {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Value For X1: ");
        int x1=in.nextInt();
        System.out.print("Enter The Value For Y1: ");
        int y1=in.nextInt();
        System.out.print("Enter The Value For X2: ");
        int x2=in.nextInt();
        System.out.print("Enter The Value For Y2: ");
        int y2= in.nextInt();
        double distance=Math.sqrt(((y2-y1)*(y2-y1))+((x2-x1)*(x2-x1)));
        System.out.println("The Distance Of Two Points Is: "+distance);
    }
}
