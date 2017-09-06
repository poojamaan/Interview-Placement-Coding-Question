/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Scanner;

/**
 *
 * @author Pooja
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Enter no ");
           int n=5;
        int count=n-n/2;
        if(n==1)
            System.out.println("***");
        else{
            for (int i=1;i<=(n+1)/2; i++){
                count++;
                for (int l=1;l<=count;l++)
                    System.out.print(" ");
                for (int j=1;j<=i;j++)
                    System.out.print("*");
                System.out.print(" ");
                for (int k=1;k<=i;k++)
                    System.out.print("*");
              System.out.println();
            }
        }
    }
}