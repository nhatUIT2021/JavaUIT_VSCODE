import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap gio: ");
        String str = scan.nextLine();
        String[] tong = str.split("h");
        String h=tong[0];
        String p=tong[1].split("p")[0];
        String s=tong[1].split("p")[1];
        s=s.split("s")[0];

        int gio = Integer.parseInt(h);
        int phut = Integer.parseInt(p);
        int giay = Integer.parseInt(s);
        int tonggiay = gio*3600+phut*60+giay;
        System.out.println(tonggiay);
    }
}
