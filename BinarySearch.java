
package hello;
import java.io.*;
import java.util.*;

public class BinarySearch {
    
    int binary(int ar[],int n,int first,int last,int find)
    {
         int mid;
        int i=0;
        while(i<n)
        {
           mid=(first+last)/2;
            if(ar[mid]==find)
            return mid;
            else
            if(ar[mid]<find)
                first=mid+1;
            else
                if(ar[mid]>find)
                    last=mid-1;
                else 
                    System.out.println("Element not found");
             i++;   
        }
        return -1;
    }
    public static void main(String ar[])
    {
        int arr[]= new int[10];
        System.out.print("Enter the number of elements insert\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter elements to sorted");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
         System.out.println("Enter search element");
         int search=sc.nextInt();
        
        BinarySearch bs=new BinarySearch();
        int index=bs.binary(arr, n,0,n-1,search);
            System.out.println("eleemenet in found is "+index);
           
        
    }
}
