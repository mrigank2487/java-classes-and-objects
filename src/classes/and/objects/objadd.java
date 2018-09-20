/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes.and.objects;

/**
 *
 * @author Sandeep
 */
import java.io.*;
import java.util.Scanner;
class test
{
   private int x,y;
    void getxy()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a value: "); 
        x=Sc.nextInt();
        System.out.println("Enter another value: "); 
        y=Sc.nextInt();
    }
    
    void addobj(test t1, test t2)
    {
        x=t1.x+t2.x;
        y=t1.y+t2.y;
    }
    
    void display()
    {
        System.out.println("The sum of x is: "+x);
        System.out.println("The sum of y is: "+y);
    }
}


public class objadd 
{
    public static void main(String args[]) throws IOException
    {
        test t1 = new test();
        test t2 = new test();
        test t3 = new test();
        
        t1.getxy();
        t2.getxy();
        t3.addobj(t1,t2);
        t3.display();
    }
}
