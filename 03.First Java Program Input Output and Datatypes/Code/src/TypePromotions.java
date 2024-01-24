public class TypePromotions {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        System.out.println("Float : "+(f*b)+"Int : "+(i/c)+"Double : "+(d*s));
        /*So The Highest Datatype Among Is Double
        Then The Result DataType Will Be Promoted To Double*/
        System.out.println(result);
    }
}

