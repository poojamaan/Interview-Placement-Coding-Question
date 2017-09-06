
package practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class DuplicateCollection {
    
    static void duplicate(ArrayList<Integer> allo)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count;
      
         for(Integer i:allo)
         {
                    if(hm.containsKey(i))
                    {  
                           count=hm.get(i);
                           hm.put(i,count+1);
                    }
             else
                    {
                        count=1;
                       hm.put(i, count); 
                    }
                 
             
         }
        
        for(Integer i:hm.keySet())
        {
            System.out.println("Duplicate value at "+i+"   "+hm.get(i));
        }
    }
    
    public static void main(String ar[])
    {
        int[] arr=new int[6];
        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.println("Enter array");
        Scanner sc=new Scanner(System.in);
        
            
        for(int i=0;i<6;i++)
            al.add(sc.nextInt());
        duplicate(al);
    }
}
