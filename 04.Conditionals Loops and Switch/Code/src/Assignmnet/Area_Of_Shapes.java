package Assignmnet;
import java.util.Scanner;
import static java.lang.System.exit;
public class Area_Of_Shapes
{
    private static double pi=3.142;
    private static double Area=0;
    private  static double Input1=0;
    private static double Input2=0;
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("\n1 For Area Of Circle \n2 For Area Of Triangle \n3 For Area Of Rectangle \n4 Area Of Isosceles \n5 Area Of Parallelogram \n6 Area Of Rhombus \n7 Area Of Equilateral \n8 For Exit..,");
            System.out.print("Enter Your Choice: ");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter The Radius For The Circle: ");
                    Input1=in.nextInt();
                    Area=pi*(Input1*Input1);
                    System.out.print("The Area Of Circle is: "+Area);
                    break;
                case 2:
                    System.out.print("Enter The Base Of The Triangle: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Of The Triangle: ");
                    Input2=in.nextInt();
                    Area=0.5*Input1*Input2;
                    System.out.print("The Area Of Triangle is: "+Area);
                    break;
                case 3:
                    System.out.print("Enter The Length Of The Rectangle: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Width Of The Rectangle: ");
                    Input2=in.nextInt();
                    Area=Input1*Input2;
                    System.out.print("The Area Of Rectangle is: "+Area);
                    break;
                case 4:
                    System.out.print("Enter The Base Of Isosceles Triangle: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Value Of Isosceles Triangle: ");
                    Input2=in.nextInt();
                    Area=(Input1*Input2)/2;
                    System.out.print("The Area Of Isosceles is: "+Area);
                    break;
                case 5:
                    System.out.print("Enter The Base Of Parallelogram: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The Height Value Of Parallelogram: ");
                    Input2=in.nextInt();
                    Area=Input1*Input2;
                    System.out.print("The Area Of Parallelogram is: "+Area);
                    break;
                case 6:
                    System.out.print("Enter The DiagonalOne For Rhombus: ");
                    Input1=in.nextInt();
                    System.out.print("Enter The DiagonalTwo For Rhombus: ");
                    Input2=in.nextInt();
                    Area= (Input1 * Input2) /2;
                    System.out.print("The Area Of Isosceles is: "+Area);
                    break;
                case 7:
                    System.out.print("Enter The Length For Equilateral: ");
                    Input1=in.nextInt();
                    Area=((Input1*Input1)*Math.sqrt(3))/2;
                    System.out.print("The Area Of Equilateral is: "+Area);
                    break;
                case 8:
                    exit(0);
                default:
                    System.out.println("Invalid Choice!!!..,");
                    break;
            }
        }
    }
}
