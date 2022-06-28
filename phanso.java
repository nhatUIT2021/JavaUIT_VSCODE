import java.util.Scanner;

public class phanso {
    int tuso;
    int mauso;
    public phanso(){
        this.tuso=0;
        this.mauso=1;
    }
    public phanso( int a , int b){
        this.tuso = a;
        this.mauso= b;
    }
    public void nhapphanso(){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap tu so : ");
        this.tuso = scan.nextInt();
        System.out.print("nhap mau so : ");
        this.mauso = scan.nextInt();
    }
    public void xuatphanso(){
        System.out.println(tuso+"/"+mauso);
    }
    public phanso congphanso(phanso b){
        phanso c=new phanso();
        c.mauso = mauso* b.mauso;
        c.tuso= tuso*b.mauso +b.tuso*mauso;
        return c;
    }
    public phanso tru(phanso b){
        phanso c=new phanso();
        c.mauso = mauso* b.mauso;
        c.tuso= tuso*b.mauso -b.tuso*mauso;
        return c;
    }

    public phanso nhan(phanso b){
        phanso c=new phanso();
        c.mauso = mauso* b.mauso;
        c.tuso= tuso*b.tuso;
        return c;
    }

    public phanso chia(phanso b){
        phanso c=new phanso();
        c.mauso = mauso* b.tuso;
        c.tuso= tuso*b.mauso;
        return c;
    }

    public void rutgon(){
        for(int i=tuso-1; i>0; i--){
            if(tuso%i==0 && mauso%i ==0){
                this.tuso=tuso/i;
                this.mauso=mauso/i;
            }
        }
    }
   
    public static void main(String[] args)
    {
        phanso a = new phanso(1,2);
        phanso b = new phanso(2,6);
        phanso c =a.congphanso(b);
        c.xuatphanso();
    }
}
