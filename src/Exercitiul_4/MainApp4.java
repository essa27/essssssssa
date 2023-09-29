package Exercitiul_4;

import java.util.Random;

public class MainApp4
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int a = 40;
        int b = 40;


        a = rand.nextInt(31);

        b = rand.nextInt(31);

        System.out.println("CMMDC al numerelor "+a+" si "+b+" este ");

        while(a != b)
        {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println(a+".");
    }
}