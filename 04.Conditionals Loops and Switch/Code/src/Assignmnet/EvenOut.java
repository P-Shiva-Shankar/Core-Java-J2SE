package Assignmnet;

import java.util.Scanner;

public class EvenOut {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter The Month Number: ");
        int input=in.nextInt();
        int count=0;
        for (int i = 1; i <=months[input-1]; i++) {
            if(i%2==0)
            {
                count++;
            }

        }
        System.out.println("shiva is allowed to go out with his friends only on the "+count+" days of a given month");
    }
}
