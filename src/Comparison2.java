/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep
 */
import java.io.*;
import java.util.Scanner;

class compare2
{
    private int a,b;
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
    }
    
    private int compare_numbers()
    {
        if (a>b)
            return a;
        else
            return b;     
        
    }
    
   void display()
    {
        int n=compare_numbers();
        if(n==a)
           System.out.println("The greater of "+a+" and "+b+" is "+a);
        else if(n==b)
           System.out.println("The greater of "+a+" and "+b+" is "+b);
        
    }
};

public class Comparison2
{
    public static void main(String args[]) throws IOException
    {
        compare2 C= new compare2();
        C.getdata();
        C.display();
    }
};
