
package hello;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetClass {
    void practiceset()
    {
        Set<String> hs=new HashSet<String>();
        hs.add("geeks");
        hs.add("for");
        hs.add("geeks");
        hs.add("example");
        System.out.println("Set oupiut without duplicacy");
        System.out.println(hs);
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
           
            {
                System.out.println(it.getClass().getName());
            }
        }
        System.out.print("Sorted set passing into tree set");
        Set<String> ts=new TreeSet<String>(hs);
        System.out.println(ts);
        }
    
    static void unionIntersection()
    {
        Set<Integer> hs= new HashSet<Integer>();
        hs.addAll(Arrays.asList(new Integer[]{1,2,3,4,8,9,0}));
        Set<Integer> hs1=new HashSet<Integer>();
        hs1.addAll(Arrays.asList(new Integer[]{1,3,7,5,0,7,5}));
        // to find union
        Set<Integer> union = new HashSet<Integer>(hs);
        union.addAll(hs1);
        System.out.println("UNion of two sets");
        System.out.println(union);
        
        Set<Integer> intersection = new HashSet<Integer>(hs);
        intersection.retainAll(hs1);
        System.out.println("UNion of two sets");
        System.out.println(intersection);
        
        Set<Integer> difference = new HashSet<Integer>(hs);
        difference.removeAll(hs1);
        System.out.println("UNion of two sets");
        System.out.println(difference);
        
    }
    
    
    public static void main(String ar[])
    {
        unionIntersection();
}
}
