package Assignmnet;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The String: ");
        String word=in.nextLine();
        String revesWord="";
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            revesWord=ch+revesWord;
        }
        System.out.println("The Reverse Of This "+word+" String Is: "+revesWord);

    }
}
