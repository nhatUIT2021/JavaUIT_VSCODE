import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap b: ");
        int s1 = scan.nextInt();

        System.out.print("nhap c: ");
        int s2 = scan.nextInt();

        float result = -1.0f*s2 /s1;
        System.out.println(result);

    }
}
