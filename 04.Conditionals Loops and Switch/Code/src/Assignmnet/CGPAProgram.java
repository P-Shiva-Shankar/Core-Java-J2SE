package Assignmnet;

import java.util.Scanner;

public class CGPAProgram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The How Many Number Of Subjects In Sem: ");
        int number_subjects=in.nextInt();
        int totalMarks=number_subjects*100;
        int sum=0;
        for (int i = 1; i <=number_subjects; i++) {
            System.out.print("Enter The Subject "+i+" Marks: ");
            int marks=in.nextInt();
            sum+=marks;
        }
        double percentage= (double) sum /totalMarks*100;
        double cgpa=percentage/9.5;
        System.out.println("The CGPA Of The This Sem Is: "+cgpa);

    }
}
