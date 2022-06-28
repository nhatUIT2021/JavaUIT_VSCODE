import java.util.Scanner;

public class tamgiac {
    int x;
    int y;
    int z;
    public tamgiac(){
        x=y=z=0;
    }
    public tamgiac(int a, int b, int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    public void nhaptamgiac(){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap canh x : ");
        this.x = scan.nextInt();
        System.out.print("nhap canh y : ");
        this.y = scan.nextInt();
        System.out.print("nhap canh z : ");
        this.z = scan.nextInt();
    }
    public void xuattamgiac(){
        System.out.print("canh 1: "+x+ " canh 2: "+y+ " canh 3: "+ z) ;
        
    }

    public void xetloaitamgiac(){
        boolean can, vuong, deu;
          if ( (x+y)>z  && (x+z)>y && (y+z)>x)
          {
            
            can=vuong=deu=false;
              if( x==y && y==z ) {deu=true;}
              if( (x*x +y*y) == z*z ||  (x*x +z*z) == y*y ||  (y*y +z*z) == x*x )  { vuong =true;}
              if( (x==y && y!=z) || (x==z && y!=z) || (z==y && y!=x) )  { can =true;}

              if(deu) { System.out.println("tam giac deu"); }
              else if (vuong && can)  { System.out.println("tam giac vuong can"); }
              else if (vuong )  { System.out.println("tam giac vuong "); }
              else if (can )  { System.out.println("tam giac can "); }
              else {System.out.println("tam giac thuong");}

          }
          
          else
          {
              System.out.println("khong phai tam giac");
          }
    }

    public void tinhchuvi(){
        System.out.println(x+y+z);
    }

    public void tinhdientich(){
        float s= 1.0f*(x+y+z)/2;
        float dientich = s*(s-x)*(s-y)*(s-z);
        System.out.println(dientich);
    }
    public static void main(String[] args){
        tamgiac a=new tamgiac(2,3,4);
        a.xetloaitamgiac();

    }
}
