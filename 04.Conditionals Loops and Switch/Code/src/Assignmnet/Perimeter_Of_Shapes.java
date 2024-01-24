package Assignmnet;

import java.util.Scanner;

import static java.lang.System.exit;

public class Perimeter_Of_Shapes {
    private static double pi=3.142;
    private static double Perimeter=0;
    private  static double Input1=0;
    private  static double Input2=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("\n1 For Perimeter Of Circle \n2 For Perimeter Of Equilateral \n3 For Perimeter Of Rectangle \n4 For Perimeter Of Square \n5 Area Of Parallelogram \n6 Area Of Rhombus \n7 For Exit..,");
            System.out.print("Enter Your Choice: ");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter The Radius For The Circle: ");
                    Input1=in.nextInt();
                    Perimeter=2*pi*Input1;
                    System.out.print("The Perimeter Of Circle is: "+Perimeter);
                    break;
                case 2:
                    System.out.print("Enter The Length Of The Equilateral: ");
                    Input1=in.nextInt();
                    Perimeter=3*Input1;
                    System.out.print("The Perimeter Of Triangle is: "+Perimeter);
                    break;
                case 3:
                    System.out.print("Enter The Length Of The Rectangle: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Width Of The Rectangle: ");
                    Input2=in.nextInt();
                    Perimeter=2*(Input1+Input2);
                    System.out.print("The Perimeter Of Rectangle is: "+Perimeter);
                    break;
                case 4:
                    System.out.print("Enter The Side Length Of Square: ");
                    Input1=in.nextInt();
                    Perimeter=4*Input1;
                    System.out.print("The Perimeter Of Square is: "+Perimeter);
                    break;
                case 5:
                    System.out.print("Enter The Base Of Parallelogram: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Value Of Parallelogram: ");
                    Input2=in.nextInt();
                    Perimeter=2*(Input1*Input2);
                    System.out.print("The Perimeter Of Parallelogram is: "+Perimeter);
                    break;
                case 6:
                    System.out.print("Enter The OneSideLength For Rhombus: ");
                    Input1=in.nextInt();
                    Perimeter= 4*Input1;
                    System.out.print("The Perimeter Of Isosceles is: "+Perimeter);
                    break;
                case 7:
                    exit(0);
                default:
                    System.out.println("Invalid Choice!!!..,");
                    break;
            }
        }
    }
}
