
package hello;

import java.util.Scanner;


public class ReverseWord {
      
    public static void main(String ar[])
    {
        String str="",str1="";
        char[] str2=new char[20];
        int i,j;
        System.out.println("Enter name of String");
        Scanner sc= new Scanner(System.in);
        str=sc.next();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                str1=str2.toString()+str;
                 System.out.println(str1); 
                i=0;
               
                
            }
            else
                
                str2[i]=str.charAt(i);
            
             System.out.println(str2); 
            
        }
           
    }
    
}
