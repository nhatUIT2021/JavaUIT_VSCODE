import java.util.Scanner;
import java.lang.Math;

public class lab3_bai5 {

    

       static int myMethod_A(int x) {
        int tong=0;
        for (int i=0; i<=x; i++){
            tong+=i;
        }
        System.out.println(tong);
        return tong;
       }

       static int myMethod_B(int x) {
        int tong=0;
        for (int i=0; i<=x; i++){
            tong+=i*10+2;
        }
        System.out.println(tong);
        return tong;
       }
       
       static float myMethod_C(int x) {
        float tong=0;
        for (int i=0; i<=x; i++){
            tong+=1.0f/i;
        }
        System.out.println(tong);
        return tong;
       }

       static int giaithua(int x){
        int result=1;
        for(int i=1; i<=x ;i++){
            result*=i;
        }
        return result;
       }

       static float myMethod_D(int x) {
        float tong=0;
        for (int i=0; i<=x; i++){
            tong+=giaithua(i);
        }
        System.out.println(tong);
        return tong;
       }

       static int myMethod_E(int x) {
        int tong=0;
        for (int i=1; i<=x; i++){
            tong*=i;
        }
        System.out.println(tong);
        return tong;
       }
      public static void main(String[] args) {
        // predefined standard input object
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        // Character input
        int n = scan.nextInt();
        //scan.close();
        
        myMethod_D(n);

      }
}
