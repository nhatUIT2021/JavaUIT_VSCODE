import java.util.Scanner;

public class lab2_bai10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("nhap so n: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }
    }
}