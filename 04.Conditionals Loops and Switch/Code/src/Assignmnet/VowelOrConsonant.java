package Assignmnet;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Alphabet: ");
        char ch=in.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I')
        {
            System.out.println("The Alphabet Is Vowel");
        }
        else {
            System.out.println("The Alphabet Is Consonant");
        }
    }
}
