// Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

import java.util.Scanner;

public class Question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0, second = 1; // Fibonacci Series starts with 0 , 1

        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first+" ");
            int nextNum = first + second;
            first = second;
            second = nextNum;
        }

        sc.close();
    }
}