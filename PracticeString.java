
package hello;


public class PracticeString {
    
    public static void main(String ar[])
    {
        String s1="A new boook on jav";
        String s2= new String("ihek like coffe");
        char arr[]= {'p','o','o','j','a'};
        String s3=new String(arr);
        
        System.out.print(s1);
         System.out.println(s2); System.out.print(s3);
          System.out.println("Length of String"+s1.length());
           System.out.println("concant two string"+s1.concat(s3));
            System.out.println(s1+"from"+s2);
         
            boolean x=s2.startsWith("A");
            if(x)
         System.out.println("s1 is starts with A");
            else
                 System.out.println("it will not start with A");
        String p=s2.substring(0,7);
        String q=s3.substring(0,3);
         System.out.print(p+q);
         
          System.out.println(s1.toUpperCase());
           System.out.println(s2.toLowerCase());
            System.out.println("print trim"+s1.trim());
             System.out.println("split"+s2.split(" "));
    }
}
