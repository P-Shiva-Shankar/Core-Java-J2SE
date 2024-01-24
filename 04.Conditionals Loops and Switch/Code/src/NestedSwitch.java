import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the employee id: ");
        int eid=in.nextInt();
        System.out.print("Enter the department: ");
        String dept=in.next();
        switch (eid)
        {
            case 1:
                System.out.println("P Shiva Shankar");
                break;
            case 2:
                System.out.println("Vikram");
                switch (dept)
                {
                    case "banking":
                        System.out.println(eid);
                        System.out.println("Banking");
                        break;
                    case "iot":
                        System.out.println(eid);
                        System.out.println("IOT");
                        break;
                    default:
                        System.out.println("Invalid Department");
                }
                break;
            default:
                System.out.println("Invalid Employee Id");
        }
    }
}
