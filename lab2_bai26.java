import java.util.Scanner;
import java.lang.Math;

public class lab2_bai26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
       double result=0;
        for (int i=0 ; i<=a ;i+=1) {
        	result += (2*i*1.0f + 1)/ (2*i+2);

        }
    	System.out.print(result);

	}
}
