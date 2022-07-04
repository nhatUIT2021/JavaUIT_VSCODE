package lab5;

public class nhanvien_sanxuat extends nhanvien {
    int sosanpham super.luongcb=5400000;

    public nhanvien_sanxuat(int x) {
        sosanpham = x;
    }

    public void tinhluong() {
        this.setluongcb(5400000);
        luong = sosanpham * 170000 + luongcb;
    }

    public static void main(String[] args) {
        nhanvien_sanxuat a = new nhanvien_sanxuat(100);
        a.tinhluong();
        System.out.println(a.luong);
    }
}
