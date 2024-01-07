// Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("\nEnter Second Number: ");
        int b = sc.nextInt();

        int gcd = 0;
        
        int min = (a < b) ? a : b;
        

        for(int i=1; i<=(min/2); i++){
            if(a%i==0 && b%i==0) gcd = i;
        }
        System.out.println("\nGCD of "+a+" and "+b+" is: "+gcd);

        sc.close();
    }
}
