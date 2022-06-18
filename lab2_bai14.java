import java.util.Scanner;
public class lab2_bai14 {

    public static void main(String[] args)
      {
          Scanner in = new Scanner(System.in);
  
          System.out.print("Input so km: ");
          int x = in.nextInt();
          int tien=0;
          if (x==1){tien=15000;}
          else if(x>1 && x<6) {tien= 15000+(x-1)*13500;}
          else if(x>=6) {
            tien=  (15000 + 4*13500 + (x-5)*11000);
        
        }
          if(x>120){tien=tien*9/10;}
          System.out.println(tien);
      }
  }