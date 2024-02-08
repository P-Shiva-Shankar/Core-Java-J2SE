

import java.util.ArrayList;

public class OperatorOverloading {
    public static void main(String[] args) {
        //Char + char
        System.out.println('a'+'b');
        //String + String
        System.out.println("ab"+"c");
        //String + char
        System.out.println("ab"+'c');
        //String + Int
        System.out.println("a"+1);
        //Char + Int
        System.out.println('a'+1);
        System.out.println((char) ('a'+1));
//        System.out.println(new Integer(56)+new ArrayList<>());//Gives Error For this case..,
    }
}
