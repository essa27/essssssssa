package ex1;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


    public class MainApp
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("lung= ");
            int lung = scanner.nextInt();
            System.out.print("lat= ");
            int lat = scanner.nextInt();
            int per = 2 * (lung + lat);
            int aria = lung * lat;
            System.out.println("per" + per);
            System.out.println("aria" + aria);
            scanner.close();
        }
    }




