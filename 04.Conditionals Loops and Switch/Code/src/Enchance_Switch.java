import java.util.Scanner;

public class Enchance_Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit=in.next();
        switch (fruit) {
            case "mango" -> System.out.println("King of all fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round orange fruits");
            default -> System.out.println("Invalid");
        }
    }
}
