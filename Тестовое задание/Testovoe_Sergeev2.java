import java.util.Scanner;

public class Testovoe_Sergeev2
{
   public static void main (String[] args)
   {
    int[] stroka1 = new int[1];
    int[] stroka2 = new int[1];
 
    Scanner input = new Scanner (System.in);

    System.out.println ("Введите первую строку: ");
    for(int i = 0; i < stroka1.length; i++) {
        int value = input.nextInt();
        stroka1[i] = value;
        System.out.println(stroka1[i]);
    }

    System.out.println ("Введите вторую строку: ");
    for(int i = 0; i < stroka2.length; i++) {
        int value = input.nextInt();
        stroka2[i] = value;
        System.out.println(stroka2[i]);
    }
       
    for(int i = 0; i < stroka1.length; i++)
    if(stroka1[i] == stroka2[i]) {
        System.out.println("Строки совпадают"); 
    }

    else {
        System.out.println("Строки не совпадают"); 
    }
    
   }
}