
package practice;

class Tree{
    public void saveUser()
    {
         System.out.println("Alpha");
    }
}

 class Pine extends Tree
{
public void saveUser()
{
     System.out.println("Beta");
}
}
class Oak extends Tree{
    
    static
            {
                 System.out.println("A");
            }
            static
            {
                System.out.println("B");
            }
            static 
            {
                System.out.println("C");
            }
            {
                System.out.println("D");
            }
            {
            System.out.println("E");
            }
            
            {
                System.out.println("F");
            }
}

class Test {
    static void testFun()
    {
        try{
             System.out.println(Integer.parseInt("A"));
        }
        catch(NumberFormatException nfe)
        {
             System.out.println("B");
        }
        
        catch( Exception e)
        {
             System.out.println("C");
             
        }
        finally
        {
             System.out.println("D");
        }
    }
}
//class Base{
//    Base()
//    {
//        System.out.println("Alpha");
//    }
//}


public class innovationM {
//    public innovationM()
//        {
//            System.out.println("Base");
//        }
    public static void main(String[] args)
    {
        new Oak();
        new Oak();
        
        
        
        
        
//        new Test().testFun();
        
        
        
        
//         System.out.println((1+2+3)+"hi"+9+8+6+"h"+(4+5));
        
        
        
       // System.out.println((true==false)?"hi":"bye");
        
        
        
        
        
//        String x =new String("xyz");
//         System.out.println(x.hashCode());
//        StringBuffer y= new StringBuffer("abc"+x);
//         System.out.println(y.hashCode());
//        y.append("efg");
//        
//        System.out.println(y.hashCode());
        
        
//        
//        int y=1;
//        y=y+1;
//        switch(y)
//        {
//            case 1: y++;
//             case 2:y++;  
//                 case 3:y--;
//                 default: y++;
//                     case 4:y++;
//        }
//        System.out.println(++y);
        
        
//        Tree t=new Pine();
//        t.saveUser();
//        
        
    /*    int a=2;
        india:
        {
            ++a;
            if(a==3)
            {
                continue india;
            }
        }
        System.out.println(a);
      */  
        
//        int j=1;
//        for(int i=1;i<5;i++)
//        {
//            j*=i;
//            if(j==5)
//                break;
//        }
//       
//            System.out.println(j);
        
//        new innovationM();
//        new Base();
        
//        int i=1,j=0;
//        switch(i)
//        {
//            case 2:j+=6;
//            case 4:j+=1;
//            default:j+=2;
//            case 0:j+=4;
//            case 6:j+=3;
//        }
//        System.out.println("j="+j);
//        
      /*  Tree tree= new Pine();
        if(tree instanceof Pine)
            System.out.println("Pine");
        if (tree instanceof Tree)
            System.out.print("Tree");
        if(tree instanceof Oak)
            System.out.println("Oak");
        else 
            System.out.println("Oops");
    }
        }1        */
        
       /* try{
            badMethod();
            System.out.println("A");
            
        }
        catch(Exception ex)
        {
            System.out.println("B");
            
        }
        finally{
            System.out.println("C");
            
        }
        System.out.println("D");
    }
    
    public static void badMethod() throws Exception
    {
        throw new Exception();
    }
     
        */
        
        
    }
}
