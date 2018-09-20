/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes.and.objects;
import java.util.Scanner;

/**
 
 */

class ItemCode
{
 
    private int itemcode[] = new int[10];
    private int itemprice[] = new int[10];
    private int i;

    void getitems()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter item code of item "+i+1+": "); 
        itemcode[i]=Sc.nextInt();
          
        System.out.println();
        System.out.println("Enter item price of item "+i+1+": ");
           
        itemprice[i]=Sc.nextInt();
        System.out.println();
           i++;
         
    }
    void display()
    {
        int k=1,t;
        for(t=0;t<i;t++)
         {
          System.out.println("For item "+k);
          System.out.println("Item code :"+itemcode[t]);
          System.out.println("Item price :Rs."+itemprice[t]);
          k++;
         System.out.println();
         }
    }
    void sum()
    {
         int sum=0,q;
         for(q=0;q<i;q++)
          sum = sum + itemprice[q];
         System.out.println("Total = Rs. "+sum);
    }
    void removes()
    {
        Scanner Sc=new Scanner(System.in);
        int code,sumup=0,f,u,h;
        System.out.println("Enter code of the item to be removed");
        code=Sc.nextInt();

        for(h=0;h<i;++h)
         {
           if(itemcode[h]==code)
            itemprice[h]=0;
         }

            if(h==8)
             {
              System.out.println("You have not bought this item.");
             }
            else
             {
               System.out.println("The new bill is: ");
               for(h=0;h<i;h++)
                System.out.println("Item: "+itemcode[h]+"has Item price: Rs"+itemprice[h]);
             }

        for(f=0;f<i;f++)
          sumup = sumup + itemprice[f];
         System.out.println("Your Total amount is Rs. "+sumup);
         System.out.println();
       }
    ItemCode()
    {
     i=0;
    }
};

public class Item
{
 public static void main(String args[])
 {
     ItemCode I= new ItemCode();
     int c,ch;
     


     System.out.println("WELCOME");

     do
      {
       Scanner Sc=new Scanner(System.in); 
       System.out.println("Press 1 for entering items ");
       System.out.println("Press 2 for total ");
       System.out.println("Press 3 for displaying items ");
       System.out.println("Press 4 for removing items ");
       System.out.println("Make a choice ");
       c=Sc.nextInt();

       switch (c)
        {
         
        case 1:
            I.getitems();

        case 2:
            I.sum();
            break;
        case 3:
           I.display();
           break;
        case 4:
           I.removes();
           break;
     }
      System.out.println("Do you want to continue?(1/0)");
         ch=Sc.nextInt();
    }while(ch==1);

}
}


