public class SwappingOfNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("After calling the swap function in the main a="+a+" b="+b);
    }
    static void swap(int num1,int num2)
    {
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping inside the function a="+num1+" b="+num2);
    }
}
