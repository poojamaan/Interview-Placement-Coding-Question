
package javaconcept;

class Parent 
{
     static int count=0,len=0;
     
   Parent()
    {
        
        count++;
    }
   {
         len++;
     }
}

class Child extends Parent
{
    static int big=0;
    {
        big++;
    }
    
    Child(int i)
    { 
         this();
        count++;
        System.out.println("count="+count);
         System.out.println("length="+len);
        System.out.println("big="+big);
    }
    Child()
    {
        
    }
    
}

class SupChild extends Child
{
    SupChild()
    {
        System.out.println("big="+big);
         System.out.println("count="+count);
            System.out.println("length="+len);
    }
}
public class Constructor {
    
    public static void main(String ar[])
    {
        Parent c=new Child();
         Child c2=new Child();
         Child c1=new Child(10);
         
           Child c3=new Child(10);
           
           SupChild s1=new SupChild();
    }
}
