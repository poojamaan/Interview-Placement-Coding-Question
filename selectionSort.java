
package hello;
import java.io.*;
import java.util.*;

public class selectionSort {
    void selection(int ar[],int n)
    {
        int i,j,min,temp;
        
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(ar[min]<ar[j])
                {
                    min=j;
                }
            
                    temp=ar[min];
                    ar[min]=ar[j];
                    ar[j]=temp;
            }
                
        }
         System.out.println("Sorted array is ");
        for(i=0;i<n;i++)
        System.out.println(ar[i]);
    }
    
    public static void main(String ar[])
    {
        int arr[]=new int[20];
        Scanner sc= new Scanner(System.in);
         System.out.println("ENter n");
        int n=sc.nextInt();
         System.out.println("enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        selectionSort s=new selectionSort();
        s.selection(arr,n);
    }
}
