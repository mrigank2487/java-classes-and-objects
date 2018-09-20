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
class test2
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
    
    test2 addobj(test2 t2)
    {
        test2 t4=new test2();
        t4.x=x+t2.x;
        t4.y=y+t2.y;
        return (t4);
    }
    
    void display()
    {
        System.out.println("The sum of x is: "+x);
        System.out.println("The sum of y is: "+y);
    }
}


public class ReturnObject
{
    public static void main(String args[]) throws IOException
    {
        test2 t1 = new test2();
        test2 t2 = new test2();
        test2 t3 = new test2();
        
        t1.getxy();
        t2.getxy();
        t3= t1.addobj(t2);
        t3.display();
    }
}
