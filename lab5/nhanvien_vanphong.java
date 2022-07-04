package lab5;

public class nhanvien_vanphong extends nhanvien {
    int songaycong ;
    public nhanvien_vanphong(){}
    public nhanvien_vanphong(int a, String b, int x) {
        this.id= a;
        this.hoten=b;
        this.songaycong = x;
    }
    public void xuat(){
        System.out.println("nhan vien van phong ID: "+id);
        System.out.println("nhan vien van phong ho ten: "+hoten);
        System.out.println("nhan vien van phong so ngay cong: "+songaycong);
        System.out.println("nhan vien van phong luong: "+luong);
    }
    public void tinhluong() {
        this.setluongcb(4500000);
        luong = songaycong * 220000 + luongcb;
    }

    public static void main(String[] args) {
        
    }
}
