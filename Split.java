/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author Pooja
 */
public class Split {
    public static void main(String ar[])
    {
        String arrr="hello maan i am pooja";
        String s[];
        String[] str=new String[20];
        str=arrr.split("\\s");
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
    }
}
