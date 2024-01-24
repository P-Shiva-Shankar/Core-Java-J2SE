public class LargestOfThree02 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=5;
        int max=0;
        if(a>b)
        {
            max=a;
        }
        else {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("Largest Number is :- "+max);
    }
}
