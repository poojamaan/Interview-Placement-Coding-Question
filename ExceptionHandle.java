/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconcept;

/**
 *
 * @author Pooja
 */
public class ExceptionHandle {

public static void main(String[] args){
try{
System.out.println("statement1");
System.out.println("statement2");
System.out.println("statement3");
	try{
	       System.out.println("statement4");
	       System.out.println("statement5");
	       System.out.println("statement6");
	     }
	     catch(ArithmeticException  e){
	     System.out.println("statement7");
	     }
	    finally
	    {
	    System.out.println("statement8");
	    }
	    System.out.println("statement9");
    }
catch(Exception e)
{
System.out.println("statement10");
}
finally
{
System.out.println("statement11");
}
System.out.println("statement12");
}

}
