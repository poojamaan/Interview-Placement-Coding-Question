// Factorial of n number with recursion 
package hello;
import java.io.*;
import java.util.*;

public class Factorial {
    static double factorial(int n)
    {
        if(n==0)
            return 1;
        else 
           return n*factorial(n-1);
    }
    public static void main(String ar[])
    {
        int n;
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        double fact=factorial(n);
        System.out.print(fact);
        
        
    }
}
