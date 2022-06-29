import java.lang.Math;

public class duongtron {
    toado a=new toado();
    float r;
    public duongtron(){
        this.a.a=0;
        this.a.b=0;
        this.r=0;
    }
    public duongtron(int x, int y,int z){
        this.a.a=x;
        this.a.b=y;
        this.r=z;
    }
    public void xuat(){
        System.out.println(this.a.a +" "+this.a.b+" "+this.r);
    }
    public void tinhchuvi(){
        System.out.println(r*2*3.14);
    }
    public void tinhdientich(){
        System.out.println(r*r*3.14);
    }
    public void kiemtragiaonhau(duongtron y){
        float khoangcachtam = ((this.a.a -y.a.a) * (this.a.a -y.a.a) + (this.a.b -y.a.b) * (this.a.b -y.a.b)) * 1.0f;
        if (Math.abs(this.r - y.r) > khoangcachtam || khoangcachtam==0){
            System.out.println("hai duong tron khong giao nhau");
        }
        else{System.out.println("Hai duong tron giao nhau");}
    }
    public static void main(String[] args)
    {
        duongtron a = new duongtron(1,5,2);
        duongtron b= new duongtron(1,5,6);
        a.xuat();
        a.kiemtragiaonhau(b);
    }
}
