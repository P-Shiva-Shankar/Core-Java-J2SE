//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=in.nextInt();
        System.out.print("Enter the number2: ");
        int num2=in.nextInt();
        for (int i = num1; i <num2 ; i++)
        {
            int check,rem,sum=0;
            check=i;
            while(check!=0)
            {
                rem=check%10;
                sum=sum+(rem*rem*rem);
                check=check/10;
            }
            if(sum==i)
            {
                System.out.println(sum+" is Armstrong number");
            }
            else {
                System.out.println(sum+"  Not is Armstrong number");
            }
        }
    }
}
