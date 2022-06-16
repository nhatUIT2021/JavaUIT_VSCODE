import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class bai12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);

        System.out.println("so ngau nhien tu 0 den 100: "+ int_random);
        int min = 50;
        int max = 99;
        
        //Generate random int value from 50 to 100 
        System.out.println("so ngau nhien tu "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);

        min = -39;
        max = 79;
        
        //Generate random int value from 50 to 100 
        System.out.println("so ngau nhien tu "+min+" to "+max+ ":");
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);

        min = -79;
        max = -39;
        
        //Generate random int value from 50 to 100 
        System.out.println("so ngau nhien tu "+min+" to "+max+ ":");
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
        
    }
}
