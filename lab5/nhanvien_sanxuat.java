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

    public static void main(String[] args) {
        
    }
}
