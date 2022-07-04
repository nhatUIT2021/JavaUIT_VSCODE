package lab5;

import lab5.phanso;
import java.util.Scanner;

public class honso {
    protected double phannguyen = 1;
    phanso x = new phanso();

    public honso(double a, int b, int c) {
        phannguyen = a;
        x.tuso = b;
        x.mauso = c;
    }

    public honso() {
        phannguyen = 0;
        x.tuso = 0;
        x.mauso = 1;
    }

    public void nhaphonso() {
        System.out.print("nhap phan nguyen: ");
        Scanner scan = new Scanner(System.in);
        phannguyen = scan.nextDouble();
        x.nhapphanso();
    }

    public void xuathonso() {
        x.xuatphanso();
        System.out.print(phannguyen + " + ");
        x.xuatphanso();

    }

    public void chuyen(phanso goc) {
        phannguyen = goc.tuso / goc.mauso;
        x.tuso = goc.tuso % goc.mauso;
        x.mauso = goc.mauso;
    }

    public honso cong(honso b) {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);
        phanso b_honso = new phanso();
        b_honso.chuyen(b);
        phanso ketqua = a_honso.congphanso(b_honso);
        honso result = new honso();
        result.chuyen(ketqua);
        return result;
    }

    public honso tru(honso b) {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);
        phanso b_honso = new phanso();
        b_honso.chuyen(b);
        phanso ketqua = a_honso.tru(b_honso);
        honso result = new honso();
        result.chuyen(ketqua);
        return result;
    }

    public honso nhan(honso b) {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);
        phanso b_honso = new phanso();
        b_honso.chuyen(b);
        phanso ketqua = a_honso.nhan(b_honso);
        honso result = new honso();
        result.chuyen(ketqua);
        return result;
    }

    public honso chia(honso b) {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);
        phanso b_honso = new phanso();
        b_honso.chuyen(b);
        phanso ketqua = a_honso.chia(b_honso);
        honso result = new honso();
        result.chuyen(ketqua);
        return result;
    }

    public void sosanh(honso b) 
    {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);
        phanso b_honso = new phanso();
        b_honso.chuyen(b);
        phanso ketqua = a_honso.tru(b_honso);
        if(ketqua.tuso<0){
            System.out.println("hon so truoc nho hon hon so nhap vao sau");
        }
        else if(ketqua.tuso==0){
            System.out.println("Hai hon so bang nhau");
        }

        else {
            System.out.print("hon so sau nho hon hon so truoc");
        }

    }

    

    public honso nhan(phanso b) {
        phanso a_honso = new phanso();
        a_honso.chuyen(this);

        phanso ketqua = a_honso.nhan(b);
        honso result = new honso();
        result.chuyen(ketqua);
        return result;
    }

    public static void main(String[] args) {
        honso a = new honso();
        a.nhaphonso();
        phanso b = new phanso();
        b.nhapphanso();
        honso ketqua = new honso();
        ketqua = a.nhan(b);
        ketqua.xuathonso();
    }
}
