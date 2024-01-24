public class FunctionScope {
    static void demo() {
        int b=20;
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=10;
        demo();
        //System.out.println(b);
        /*the above b is in function level scope,
        so it cannot be accessed outside the function*/
    }
}
