

public class StringImmutable {
    public static void main(String[] args) {
        String person1="Shiva";
        String person2="Shiva";
        String person3="Shiva";
        String person4="Shiva";
        //Initial names
        System.out.println(person1+","+person2+","+person3+","+person4);
        //After changing one of the persons name
        person2="Shankar";
        System.out.println(person1+","+person2+","+person3+","+person4);
    }
}
