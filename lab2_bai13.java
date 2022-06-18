import java.util.Scanner;
public class lab2_bai13 {

    public static void main(String[] args)
      {
          Scanner in = new Scanner(System.in);
  
          System.out.print("Input canh 1: ");
          int x = in.nextInt();
          System.out.print("Input canh 2: ");
          int y = in.nextInt();
          System.out.print("Input canh 3: ");
          int z = in.nextInt();
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

          }
          
          else
          {
              System.out.println("khong phai tam giac");
          }
      }
  }