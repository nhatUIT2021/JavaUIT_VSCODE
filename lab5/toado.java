package lab5;

import java.lang.Math;

public class toado {
    int a;
    int b;

    public toado(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public toado() {
        this.a = 0;
        this.b = 0;
    }

    public void xuat() {
        System.out.println(a + " " + b);
    }

    public void khoangcach(toado c) {
        double result = (a - c.a) * (a - c.a) + (b - c.b) * (b - c.b);

        System.out.println(Math.pow(result, 0.5));
    }

    public void laytungdohoanhdo() {
        System.out.println("tung do: " + a + " hoanh do: " + b);
    }

    public void thaytungdohoanhdo(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public toado timtrungdiem(toado y) {
        toado z = new toado();
        z.a = (a + y.a) / 2;
        z.b = (b + y.b) / 2;
        return z;
    }

    public toado saochep() {
        return this;
    }

    public void xoatoado() {
        this.a = 0;
        this.b = 0;
    }

    public static void main(String[] args) {
        toado a = new toado();
        toado b = a.saochep();
        b.xuat();
    }
}
