import java.util.Scanner;
import java.lang.Math;

public class lab2_bai25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
       double result=0;
        for (int i=1 ; i<=a ;i+=1) {
        	result += i*1.0f/ (i+1);

        }
    	System.out.print(result);

	}
}
