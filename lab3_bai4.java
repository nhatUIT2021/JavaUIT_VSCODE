import java.util.Scanner;
import java.lang.Math;

public class lab3_bai4 {

    static void myMethod_A(int n) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so x: ");
        // Character input
        int x = scan.nextInt();
        System.out.println(Math.pow(x, n));
      }
    
    static int myMethod_B(int number) {
        int reverse=0;
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }  
        System.out.println("So dao la: " + reverse);  
        return reverse;
    }

    static boolean myMethod_C(int x) {
       double squareroot = Math.pow(x, 0.5);
       int test=(int)Math.round(squareroot);
       if(test*test == x) {       System.out.println("la so chinh phuong");
       return true;
       }
       else
       {System.out.println("khong la so chinh phuong");return false;}

      }

      static boolean myMethod_D(int x) {
        boolean test = true;
        for (int i=2; i<=x/2; i++){
            if(x%i ==0) {System.out.println(i);test=false; break;}
        }
        if(test==false){System.out.println("khong la so nguyen to");}
        else {System.out.println(x+" la so nguyen to");}
        return test;
       }

       static int myMethod_F(int x) {
        int tong=0;
        for (int i=2; i<=x; i++){
            if(myMethod_D(i)) {tong+=i;}
        }
        System.out.println(tong);
        return tong;
       }

       static int myMethod_G(int x) {
        int tong=0;
        for (int i=2; i<=x; i++){
            if(myMethod_C(i)) {tong+=i;}
        }
        System.out.println(tong);
        return tong;
       }

       static int myMethod_H(int x) {
        int tong=0;
        for (int i=2; i<=x; i++){
            if(x%i ==0) {tong+=i;}
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
