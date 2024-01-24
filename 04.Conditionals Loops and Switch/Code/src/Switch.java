import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit=in.next();
        switch (fruit)
        {
            case "mango":
                System.out.println("King of all fruits");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "orange":
                System.out.println("Round orange fruits");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
