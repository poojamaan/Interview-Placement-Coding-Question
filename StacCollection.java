
package hello;
import static hello.Test.stack_peek;
import static hello.Test.stack_pop;
import static hello.Test.stack_push;
import static hello.Test.stack_search;
import java.util.*;
import java.io.*;

class Test
{
       static void stack_push(Stack<Integer> stack){
            System.out.print("push th elements");
    for(int i=0;i<5;i++)
    {
       
        Integer p=(Integer)stack.push(i);
         System.out.println(p);
    }
}
       static void stack_pop(Stack<Integer> stack)
       {
            System.out.print("pop th elements");
           for(int i=0;i<5;i++)
           {
               Integer pp=(Integer)stack.pop();
               System.out.println(pp);
           }
       }
    static void stack_peek(Stack<Integer> stack)
    {
        Integer pk=(Integer)stack.peek();
        System.out.println("top of the element"+pk);
    }
    static void stack_search(Stack<Integer> stack,int element)
    {
        Integer pos=(Integer)stack.search(element);
        if(pos==-1)
            System.out.println("Element not found");
        else 
            System.out.println("Element is found");
    }
}
public class StacCollection {
    public static void main(String ar[])
    {
    Stack<Integer> stack= new Stack<Integer>();
    stack_push(stack);
    stack_pop(stack);
    stack_push(stack);
    stack_peek(stack);
    stack_search(stack,2);
    stack_search(stack,7);
    
    
    }

}
