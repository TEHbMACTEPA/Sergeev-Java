import java.util.Scanner;

/**
 * Write a description of class Lesson1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testovoe_Sergeev
{
   public static void main (String[] args)
   {
       float a;
       float b;
       
       System.out.println ("Vvedite chisla");
       
       Scanner input = new Scanner (System.in);
       a = input.nextInt();
       b = input.nextInt();
       
       if (b>0)
       {
       System.out.println ("Vi vveli " + a + " " + b);
       }
       
      if (b==0)
       {
        System.out.println ("Na 0 delit ne nado, vvedite povtorno chislo b");
        b = input.nextInt();
        System.out.println ("Vi vveli " + a + " " + b);
       }

       else if (a > b)
       {
         System.out.println (a + ">" + b);
       }
      
       else if (a == b)
       {
         System.out.println (a + "=" + b);   
       }
      
       else
       {
         System.out.println (a + "<" + b);
       }
      float c;
       System.out.println (c=a+b);
       System.out.println (a-b);
       System.out.println ("a/b= " + a/b);
       System.out.println ("a*b= " + a*b);
   }
}

