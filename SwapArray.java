
package practice;
import java.util.Scanner;

public class SwapArray {
    
  /*  void swap(String arr,int l)
    {
        char temp;
       char[]  st=arr.toCharArray();
        for(int j=0;j<l;j++)
            {
             temp=st[j];
             System.out.println(temp);
            st[j]=st[l--];
            System.out.println(st[j]);
            st[l--]= temp;
            System.out.println(st[l]);
            }
        for(int i=0;i<l;i++)
        {
            System.out.println(st[i]);
        }
        
    }*/
    
    void swap(String arr, int l)
    {
        int i,j;
        char temp;
        char[] ts=arr.toCharArray();
        for(i=0;i<1;i++)
        {
            for(j=l-1;j>=(l+1)/2;j--)
            {
                 // System.out.println(ts[i]);
                temp=ts[i];
                ts[i]=ts[j];
                ts[j]= temp;
               
                i++;
              
            }
             //System.out.println(ts[j]);
              //  System.out.println(ts[i]);
        }
        for(i=0;i<l;i++)
        {
           System.out.println(ts[i]);
        }
        
    }
    
    
    public static void main(String ar[])
    {
        String arr="richa";
            int len=arr.length();
       // Scanner sc=new Scanner(System.in);
       // for(int i=0;i<5;i++)
       // arr[i]=sc.next();
       // arr[i]=sc.next();
        SwapArray s=new SwapArray();
        s.swap(arr,len);
        
    }
}