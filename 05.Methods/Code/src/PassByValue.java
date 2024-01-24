public class PassByValue
{
    /*creating the function called greet()
    with arguments*/
    static void greet(char nam)
    {
        System.out.println("From the greet function when called:- "+nam);
        nam='a';
        System.out.println("From the greet function after changing the value: "+nam);
    }
    public static void main(String[] args) {
        //Original Value
        char name='J';
        //Passing the copy of original value
        System.out.println("From the main before calling:- "+name);
        greet(name);
        System.out.println("From the main after calling:- "+name);
    }
}
