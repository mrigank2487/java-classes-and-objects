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
class Student2
{
    private String name;
    private int age, Rollno;
    void getdata() throws IOException
    {
        
        
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=Sc.next();
        System.out.println("Enter your age: ");
        age=Sc.nextInt();
        System.out.println("Enter your Roll Number: ");
        Rollno=Sc.nextInt();
        
    }
    
    void display()
    {
        
        
        System.out.println("Your name is: "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your Roll Number is: "+Rollno);
        
    }
};


public class StudentDisplay 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
     Student2 x[]= new Student2[5];
     for(int i=0; i<5; i++)
     {
        x[i] = new Student2(); 
        x[i].getdata();
     }
     for(int j=0; j<5; j++)
         x[j].display();
     
    }
}

