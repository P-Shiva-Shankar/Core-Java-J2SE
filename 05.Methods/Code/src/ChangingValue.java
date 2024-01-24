import java.util.Arrays;
public class ChangingValue {
    static void change(int[] nums) {
        nums[1]=5;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        System.out.println("The array elements before calling: "+ Arrays.toString(arr));
        change(arr);
        System.out.println("The array elements after calling: "+ Arrays.toString(arr));
    }
}
