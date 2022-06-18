
import java.util.Scanner;
import java.util.Arrays;

public class lab2_bai11 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("nhap so : ");
        String str = scan1.nextLine();
        char[] ch = new char[str.length()];
        for (int j = 0; j < str.length(); j++) {
            ch[j] = str.charAt(j);
        }

        int[] in = new int[str.length()];
        for (int j = 0; j < str.length(); j++) {
            in[j] = str.charAt(j) - '0';
        }
        Arrays.sort(in);
        int tong = 0;
        for (int c : in) {
            tong += c;
        }
        System.out.print(tong);
    }
}
