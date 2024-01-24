public class BlockScope {
    public static void main(String[] args) {
        //Example :01
        int a=10;
        System.out.println("Outside: "+a);
         {
             a+=10;//updating inside the block
             System.out.println("Inside: "+a);
         }


        //Example: 02
        /*
        {
            int a=10;//initialized inside the block
            System.out.println("Inside: "+a);
        }
        //trying to update the value outside the block gives error
        //a+=10;
        //reinitialized same variable outside the block
        int a=20;
        System.out.println("Outside: "+a);
        */


        //Example: 03
        /*
        //declared & initialized  starting outside the block
        int a=10;
        System.out.println("Starting outside the block: "+a);
        {
            //updated inside the block
            a+=10;
            System.out.println("Inside the block: "+a);
        }
        //updating the end of the outside the block
        a=30;
        System.out.println("End outside block: "+a);
        */
    }
}











