package lab5;

public class nhanvien_sanxuat extends nhanvien {
    int sosanpham ;

    public nhanvien_sanxuat(){}

    public nhanvien_sanxuat(int a, String b, int x) {
        this.id= a;
        this.hoten=b;
        this.sosanpham = x;
    }

    public void tinhluong() {
        this.setluongcb(5300000);
        luong = sosanpham * 170000 + luongcb;
    }

    public void xuat(){
        System.out.println("nhan vien van phong ID: "+id);
        System.out.println("nhan vien van phong ho ten: "+hoten);
        System.out.println("nhan vien van phong so ngay cong: "+sosanpham);
        System.out.println("nhan vien van phong luong: "+luong);
    }

    public static void main(String[] args) {
        
    }
}
