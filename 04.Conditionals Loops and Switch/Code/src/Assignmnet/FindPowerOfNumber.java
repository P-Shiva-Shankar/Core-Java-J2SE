package Assignmnet;

import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Finding The Power Of Number Using Built-In Method Of Java
        System.out.print("Enter The Base Value: ");
        int base=in.nextInt();
        System.out.print("Enter The Exponent Value: ");
        int exponent=in.nextInt();
        int builtInPower=(int)Math.pow(base,exponent);
        System.out.println("The Power Of Base "+base+" & Exponent "+exponent+" Is Using (Math.pow): "+builtInPower);
        int power=1;
        for (int i = 0; i < exponent; i++) {
            power*=base;
        }
        System.out.println("The Power Of Base "+base+" & Exponent "+exponent+" Is Without Using (Math.pow): "+power);
    }

}
