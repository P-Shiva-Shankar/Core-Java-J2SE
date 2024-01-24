package Assignmnet;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The How Many Subjects: ");
        int sub=in.nextInt();
        int sum=0;
        for (int i = 1; i <=sub; i++) {
            System.out.print("Enter The Subject "+i+" Marks: ");
            int input=in.nextInt();
            sum+=input;
        }
        double Average= (double) sum /sub;
        System.out.format("The Average Of "+sub+" Subjects Is: %.2f ",Average);
    }
}
