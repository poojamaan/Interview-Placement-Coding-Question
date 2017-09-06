
package practice;


public class OuterClass {
    final int a=10;
    static int c=3;
    
    static final class InnerClass
    {
        public static void main(String ar[])
        {
       int b=2;
            
       // System.out.println("a=" + a);
          System.out.println("b=" + b);
           System.out.println("c=" + c);
        }
        
    }
    
    public static void main(String ar[])
    {
        
    }
    
}
