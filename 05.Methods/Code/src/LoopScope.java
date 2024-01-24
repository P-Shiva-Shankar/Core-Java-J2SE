public class LoopScope {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++)
        {
            //inside the loop accessible
            System.out.print(i+" ");
        }
        //outside the loop not accessible
        //System.out.println(i);
    }
}
