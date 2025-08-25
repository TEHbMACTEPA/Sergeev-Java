import java.util.Scanner;

public class Testovoe_Sergeev3
{
   public static void main (String[] args)
   {
    int[] stroka1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int chet = stroka1[0];
    for(int i = 0; i<stroka1.length; i++) {
        if (stroka1[i] % 2 == 0) {
            System.out.println(stroka1[i]);
        }
    }
   }
}