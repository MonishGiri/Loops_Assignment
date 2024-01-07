// Write a Java program to print a multiplication table for a given number 'n'.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=n; i<=10*n; i+=n){
            System.out.println(i);
        }
        sc.close();
    }
}
