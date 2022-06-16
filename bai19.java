import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap gio 1: ");
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
        //System.out.println(tonggiay);



        System.out.print("nhap gio 2: ");
        String str2 = scan.nextLine();
        String[] tong2 = str2.split("h");
        String h2=tong2[0];
        String p2=tong2[1].split("p")[0];
        String s2=tong2[1].split("p")[1];
        s2=s2.split("s")[0];

        int gio2 = Integer.parseInt(h2);
        int phut2 = Integer.parseInt(p2);
        int giay2 = Integer.parseInt(s2);
        int tonggiay2 = gio2*3600+phut2*60+giay2;
        //System.out.println(tonggiay2);

        System.out.println("cong hai gio " + (tonggiay+tonggiay2));
        System.out.println("hieu hai gio " + (tonggiay-tonggiay2));

    }
}