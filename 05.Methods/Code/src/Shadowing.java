public class Shadowing {
    public  static  int a=90;
    public static  void main(String[] args) {
        //higher level scope
        System.out.println(a);
        //the higher level scope a is shadowing the lower level scope
        a+=20;
        System.out.println(a);
    }
}
