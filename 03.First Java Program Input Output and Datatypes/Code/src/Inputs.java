//Importing The scanner Class
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        //Creating The Scanner Object
        Scanner input=new Scanner(System.in);
        int roll=input.nextInt();
        float marks=input.nextFloat();
        String name=input.next();
        //String fullname=input.nextLine();
        System.out.println(roll);
        System.out.println(name);
        //System.out.println(fullname);
        System.out.println(marks);
    }
}
