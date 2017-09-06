/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author Pooja
 */
public class Listiterator {
    
    public static void main(String ar[])
    {
        ArrayList a= new ArrayList();
        for(int i=0;i<10;i++)
            a.add(i);
        System.out.print(a);
        ListIterator itr=a.listIterator();
        while(itr.hasNext())
        {
            int i=(Integer)itr.next();
            System.out.println("i="+i);
            
            if(i%2==0)
            {
               i++;
              // itr.set(i);
               itr.add(i);
               
            }
        }
        System.out.println();
        System.out.println(a);
    }
}
