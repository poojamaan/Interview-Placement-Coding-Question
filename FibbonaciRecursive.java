
package practice;

import java.util.Scanner;
public class FibbonaciRecursive {
     //static int f1=0,f2=1,f3;
    static int recursion (int f1,int f2,int n)
    {
       int i=0;
      int f3;
        if(i<=n)
        {
               f3=f1+f2;
                 System.out.println(f3);
               // f1=f2;
               // f2=f3;
             return recursion(f2,f3,n-1);
         }
        else 
            return 1;
  // return f3;
        
    }
        
           
    

    public static void main(String ar[])
    {
        int n;
               
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int f1=0,f2=1;
      int series=recursion(f1,f2,n);
       System.out.println(series);
       
    }
}
