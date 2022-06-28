public class sophuc {
    int a;
    int b;
    public sophuc(){
        this.a=0;
        this.b=0;
    }
    public sophuc(int x, int y){
        this.a=x;
        this.b=y;
    }
    public void xuat(){
        System.out.println(a+" + "+b+"i");
    }
    public sophuc congsophuc(sophuc y){
        sophuc tong=new sophuc();
        tong.a=this.a+y.a;
        tong.b=this.b+y.b;
        return tong;
    }
 
    public sophuc hieusophuc(sophuc y){
        sophuc tong=new sophuc();
        tong.a=this.a-y.a;
        tong.b=this.b-y.b;
        return tong;
    }

    public sophuc tichsophuc(sophuc y){
        sophuc tong=new sophuc();
        tong.a=this.a*y.a - this.b*y.b;
        tong.b=this.a*y.b + this.b*y.a;
        return tong;
    }

    public sophuc thuong(sophuc y){
        sophuc tong=new sophuc();
        tong.a= (this.a * y.a + this.b *y.b)/(y.a*y.a + y.b* y.b);
        tong.b=(this.b * y.a - this.a *y.b)/(y.a*y.a + y.b* y.b);
        return tong;
    }


    public static void main(String[] args){
        sophuc a=new sophuc(1,2);
        
        sophuc b=new sophuc(2,3);
        sophuc tong = a.congsophuc(b);
        tong.xuat();
    }
}
