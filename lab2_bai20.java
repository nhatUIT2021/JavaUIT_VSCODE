import java.util.Scanner;

public class lab2_bai20 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input so n : ");
        int x = in.nextInt();
        int tong =1;
        for (int i=1; i<=x; i++) {tong*=i;}
        System.out.println(tong);
    }
}