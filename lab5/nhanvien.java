package lab5;
import java.util.Scanner;
import java.util.ArrayList;

public class nhanvien {
    int id;
    String hoten;
    public int luongcb;
    int luong;

    public void setluongcb(int x) {
        luongcb = x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao so nhan vien: ");
        int sonhanvien = scan.nextInt();
        scan.nextLine();
        ArrayList<nhanvien> danhsach_nhanvien = new ArrayList<nhanvien>();
        String loainhanvien;
        for (int i=0; i<sonhanvien; i++){
            System.out.print("nhap vao loai nhan vien, sx hay vp: ");
            loainhanvien = scan.nextLine();
            
            if(loainhanvien.equals("sx")){
                System.out.print("nhap vao id nhan vien san xuat: ");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.println("nhap vao ho ten nhan vien san xuat: ");
                String hoten = scan.nextLine();

                System.out.print("nhap vao so san pham: ");
                int sosanpham = scan.nextInt();
                scan.nextLine();

                nhanvien_sanxuat a =new nhanvien_sanxuat(id,hoten,sosanpham);
                a.tinhluong();

                danhsach_nhanvien.add(i, a);

            }

            else if (loainhanvien.equals("vp")) {

               

                System.out.print("nhap vao id nhan vien van phong: ");
                int id = scan.nextInt();
                scan.nextLine();


                System.out.println("nhap vao ho ten nhan vien van phong: ");
                String hoten = scan.nextLine();

                System.out.print("nhap vao so ngay cong: ");
                int songaycong = scan.nextInt();
                scan.nextLine();


                nhanvien_vanphong a =new nhanvien_vanphong(id,hoten,songaycong);
                a.tinhluong();

                danhsach_nhanvien.add(i, a);
            }
        }
        int luongmax =0;
        for (nhanvien a : danhsach_nhanvien){
            if (a.luong>luongmax){
                luongmax=a.luong;
            }
        }

        System.out.println(luongmax);
    }
}
