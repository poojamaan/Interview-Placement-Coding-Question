
package hello;
import java.util.*;

public class Foreach {
    
    public static void main(String ar[])
    {
        List<Integer> l= new LinkedList<Integer>();
        // add elements in the list 1
        l.add(2);
        l.add(3);
        l.add(5);
        
        List<Integer> s=new LinkedList<Integer>();
        s.add(2);
        s.add(5);
        s.add(7);
        
      ListIterator lt=l.listIterator();
      System.out.println("in forward direction");
      while(lt.hasNext())
      {
          System.out.println(lt.next());
          
      }
    
    ListIterator ltr=s.listIterator();
      System.out.println("in backword direction");
      while(ltr.hasPrevious())
      {
          System.out.println(ltr.previous());
          
      }
    }
    }

