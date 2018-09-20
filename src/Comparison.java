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
class compare
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
    
    void compare_numbers()
    {
        if (a>b)
            System.out.println("The greater of "+a+" and "+b+" is "+a);
        else if (b>a)
            System.out.println("The greater of "+a+" and "+b+" is "+b);      
    }
};

public class Comparison 
{
    public static void main(String args[]) throws IOException
    {
        compare C= new compare();
        C.getdata();
        C.compare_numbers();
    }
}
