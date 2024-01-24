public class PassByValue2 {
    public static void main(String[] args) {
        char name='j';
        change(name);
        System.out.println("The original value in the main: "+name);
    }
    static void change(char naam) {
        naam='a';
        System.out.println("The value inside the function: "+naam);
    }
}
