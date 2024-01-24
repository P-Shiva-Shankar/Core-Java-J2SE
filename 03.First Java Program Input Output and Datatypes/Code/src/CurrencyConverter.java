//Input currency in rupees and output in USD.


import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the rupees: ");
        int rup=in.nextInt();
        float usd=rup*0.0121f;
        System.out.println("The converted value is : "+usd);
    }
}
