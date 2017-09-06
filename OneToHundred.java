
package practice;


public class OneToHundred {
    
     void recursion(int n)
        {
            if(n<=100)
            {
            System.out.println(n);
        recursion(n+1);
            }
        }
    public static void main(String ar[])
    {
        int n=1; 
        OneToHundred o=new OneToHundred();
       o.recursion(n);
    }
}
