package Exercitiul_3;

import java.util.Scanner;
public class MainApp3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int div=1,nr=0;

        while (div <= (n/2))
        {
            if(n%div == 0)
                nr++;
            div++;
        }

        System.out.println("Numarul are "+(nr+1)+" divizori.");
        if(nr==1)
            System.out.println("Numarul este prim.");

        scan.close();
    }
}