
package hello;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

class Student
{
    private String name;
    private int roll_No;
 
    public String getName()  {  return name;   }
    public void setName(String name) { this.name = name; }
    public int getRoll_no()  { return roll_No;  }
    public void setRoll_no(int roll_no) {
        this.roll_No = roll_no;
    }
}
public class InfoClass {
    
    public static void main(String ar[])
    {
       
        int qq[]=new int[10];
        System.out.print(qq);
        Student es=new Student();
        Class s=es.getClass();
        System.out.println(s.getName());
        
        Method m[]=s.getDeclaredMethods();
        for(Method meth:m)
        {
            System.out.println(meth.getName());
        }
        Field f[]=s.getDeclaredFields();
        for(Field fl:f)
        {
            System.out.print(fl.getName());
        }
    }
}
