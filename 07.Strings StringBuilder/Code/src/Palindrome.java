
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The String With Any Spaces: ");
        String input=in.next();
        System.out.println(isPalindrome(input));

    }
    static boolean isPalindrome(String str)
    {
        //Lets us assume when string is null or empty it is palindrome
        if(str==null||str.length()==0)
        {
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i <str.length()/2 ; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
}
