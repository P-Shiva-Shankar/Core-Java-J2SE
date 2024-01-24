package Assignmnet;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Number One: ");
        int num1=in.nextInt();
        System.out.print("Enter The Number Tne: ");
        int num2=in.nextInt();
        int hcf=hcf(num1,num2);
        int lcm=(num1*num2)/hcf;
        System.out.println("The HCF Of "+num1+" & "+num2+" Is: "+hcf);
        System.out.println("The HCF Of "+num1+" & "+num2+" Is: "+lcm);

    }
    static int hcf(int a,int b)
    {
        int hcf=1;
        for(int i=1;i<=a||i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        return  hcf;
    }
}
