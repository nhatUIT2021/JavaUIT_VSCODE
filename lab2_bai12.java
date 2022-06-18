
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab2_bai12 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("nhap thang : ");
        int thang = scan1.nextInt();

        System.out.print("nhap nam : ");
        int nam = scan1.nextInt();

        int[] thang30 = { 4, 6, 9, 11 };
        int[] thang31 = { 1, 3, 5, 7, 8, 10, 12 };
        for (int i = 0; i < thang30.length; i++) {
            if (thang == thang30[i]) {
                System.out.println("thang co 30 ngay");
            }
        }
        for (int i = 0; i < thang31.length; i++) {
            if (thang == thang31[i]) {
                System.out.println("thang co 31 ngay");
            }
        }
        if (thang == 2) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0) {
                    System.out.println("thang co 29 ngay");
                }
            } else if (nam % 4 == 0 && nam % 100 != 0) {
                System.out.println("thang co 29 ngay");
            } else {
                System.out.println("thang co 28 ngay");

            }

        }

    }
}
