import java.util.Scanner;
public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=in.nextInt();
        System.out.print("Enter the digit for number of occurrence: ");
        int digit=in.nextInt();
        int count=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem==digit)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
