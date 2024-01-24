package Assignmnet;

import java.util.Scanner;

import static java.lang.System.exit;

public class Volume_Of_Shapes {
    private static double volume=0;
    private static double pi=3.142;
    private static double Input1=0;
    private static double Input2=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("\n1 For Volume Of Cone \n2 For Volume Of Prism \n3 For Volume Of Cylinder \n4 For Volume Of Sphere \n5 For Volume Of Pyramid \n6 For Exit..,");
            System.out.print("Enter Your Choice: ");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter The Radius For The Cone: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height For The Cone: ");
                    Input2=in.nextInt();
                    volume=(0.33)*pi*(Input1*Input1)*Input2;
                    System.out.print("The volume Of Cone is: "+volume);
                    break;
                case 2:
                    System.out.print("Enter The AreaBase Of The Prism: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Of The Prism: ");
                    Input2=in.nextInt();
                    volume=Input1*Input2;
                    System.out.print("The volume Of Prism is: "+volume);
                    break;
                case 3:
                    System.out.print("Enter The Height Of The Cylinder: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Radius Of The Cylinder: ");
                    Input2=in.nextInt();
                    volume=pi*(Input1*Input1)*Input2;
                    System.out.print("The volume Of Cylinder is: "+volume);
                    break;
                case 4:
                    System.out.print("Enter The Radius Of Sphere: ");
                    Input1=in.nextInt();
                    volume=(1.33)*pi*(Input1*Input1*Input1);
                    System.out.print("The volume Of Sphere is: "+volume);
                    break;
                case 5:
                    System.out.print("Enter The AreaBase Of Pyramid: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Value Of Pyramid: ");
                    Input2=in.nextInt();
                    volume=(0.33)*Input1*Input2;
                    System.out.print("The Perimeter Of Parallelogram is: "+volume);
                    break;

                case 6:
                    exit(0);
                default:
                    System.out.println("Invalid Choice!!!..,");
                    break;
            }
        }
    }
}
