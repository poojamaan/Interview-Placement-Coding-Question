
package hello;


public class Pattern {
    
    public static void main(String ar[])
    {
        int i,j,k;
        int n=7;
        for(i=1;i<=n;i+=2)
        {
            for(k=n-i;k>0;k--)
            {
                System.out.print(" ");
                
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
             System.out.print("\n");
                }
        
        for(i=n-2;i>=0;i-=2)
        {
            for(k=i;k<=n;k++)
            {
                System.out.print(" ");
                
            }
            for(j=i;j>=0;j--)
                 System.out.print("* ");
             System.out.print("\n");
                
        }
    }
}
