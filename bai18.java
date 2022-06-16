import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int s1 = scan.nextInt();

        System.out.print("nhap so 2: ");
        int s2 = scan.nextInt();

        System.out.print("nhap so 3: ");
        int s3 = scan.nextInt();

        int max=s1;
        if (s2>max) max=s2;
        if (s3>max) max=s3;

        int min=s1;
        if (s2<min) min=s2;
        if (s3<min) min=s3;
        System.out.println("max: " +max+ " min "+ min);

    }
}
