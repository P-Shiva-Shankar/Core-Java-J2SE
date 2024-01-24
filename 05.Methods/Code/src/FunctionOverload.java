public class FunctionOverload {
    static void fun(int a, int b) {
        System.out.println(a+" "+b);
    }
    static void fun(String a, int b)
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        fun(1,2);
        fun("Java",20);
    }
}
