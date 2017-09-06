
package hello;
interface A
       {
         abstract public void sum();
           abstract public void add();
       }

    class B implements A
       {
          public void sum ()
           {
               int x=9,y=7;
               int s =x+y;
                System.out.println("sum"+s);
           }
          public void add()
           {
               System.out.println("helllo i m  in B");
           }
       }
       class C extends B  implements A 
       {
           public void sum ()
           {
               //super.sum();
               int x=8,y=1;
               int s =x+y ;
                System.out.println("sum"+s);
           }
           public void add()
           {
               System.out.println("hello i m in C");
           }
           
       }
public class equal {
    
    public static void main(String ar[])
    {
       
       A a=new B();
            a.sum();
    }
}
