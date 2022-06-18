import java.util.Scanner;
import java.lang.Math;

public class lab2_bai27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
       double result=0;
        for (int i=1 ; i<=a ;i+=1) {
            int mau=0;
            for(int j=1; j<= a ;j++) { mau+=j; }
            result +=Math.pow(a, i)*1.0f / mau ;

        }
    	System.out.print(result);

	}
}
