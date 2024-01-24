import java.util.Arrays;
public class VarArgs {
    static void demo1(int...a)
    {
        System.out.println(Arrays.toString(a));
    }
    static void demo2(int a,int b,String...name)
    {
        System.out.println(a+" "+b);
        System.out.println(Arrays.asList(name));
    }
    public static void main(String[] args) {
        demo1(1,2,3,4,5,6,7,8,9);
        demo2(1,2,"Core","Java","Shiva");
    }
}
