import java.util.Scanner;
public class Numbers_print_1ton {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.print(i+",");
        }
    }
}
