import java.util.Scanner;
import java.lang.Math;

public class lab2_bai21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
       double result=0;
        for (int i=1 ; i<=a ;i+=1) {
        	result=result+Math.pow(i, -1);
        	System.out.println(result);

        }
    	System.out.print(result);

	}
}
