import java.util.Scanner;
public class lab3_bai123 {

    static void myMethod1(int x) {
        if(x<0 && x%2==0) {System.out.println(true);}
        else {System.out.println(false);}
      }
    
    static void myMethod2(int x) {
        if(x<0 && x%2!=0) {System.out.println(-1);}
        else if(x>0 && x%2==0) {System.out.println(1);}
        else {System.out.println(0);}
    }

    static int myMethod3(int x) {
        while(x<-89 || x>90) {
            Scanner scan = new Scanner(System.in);
            System.out.print("nhap lai a: ");
            // Character input
            x = scan.nextInt();
            //scan.close();
        }
        return x;
      }
      public static void main(String[] args) {
        // predefined standard input object
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        // Character input
        int x = scan.nextInt();
        //scan.close();
        myMethod1(x);
        myMethod2(x);
        x=myMethod3(x);
        System.out.print(x);

      }
}
