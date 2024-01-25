
import java.util.ArrayList;
public class MethodsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        System.out.println("The initial List : "+list);
        //Adding the value by using add method
        list.add(100);
        System.out.println("The list after adding :"+list);
        //Updating the value at particular index in list using set method
        list.set(0,10);//it updates index 0 value 15 to 10
        System.out.println("The list after updating : "+list);
        //removing the elements from the list by index  using remove method
        list.remove(3);//45 will be removed
        System.out.println("The list after removing: "+list);
    }
}
