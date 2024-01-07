// Write a Java program to check if a given string is a palindrome or not using a loop.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.next().toLowerCase();

        int i=0, j=s.length()-1;

        boolean result = false;

        while(j>=0){
            if(s.charAt(i) == s.charAt(j)){
                result = true;
                i++;
                j--;
            }
            else break;
        }
        System.out.println((result) ? s+" is Palindrome" : s+" Not Palindrome");

        sc.close();
    }
}
