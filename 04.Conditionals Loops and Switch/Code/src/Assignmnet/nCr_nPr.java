package Assignmnet;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The N Value: ");
        int nValue=in.nextInt();
        System.out.print("Enter The R Value: ");
        int rValue=in.nextInt();
        int n_rValue=nValue-rValue;
        int nFactorial=factorial(nValue);
        int rFactorial=factorial(rValue);
        int n_rFactorial=factorial(n_rValue);
        int ncrValue=nFactorial/(rFactorial*n_rFactorial);
        int nprValue=nFactorial/n_rFactorial;
        System.out.println("The nCr Value Of N= "+nValue+" & R= "+rValue+" Is: "+ncrValue);
        System.out.println("The nPr Value Of N= "+nValue+" & R= "+rValue+" Is: "+nprValue);

    }
    static int factorial(int a)
    {
        int factorial=1;
        for(int i=1;i<=a;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
}
