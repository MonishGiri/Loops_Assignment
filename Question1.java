// Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum is: "+sum);

        sc.close();
    }

}
