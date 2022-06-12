import java.util.Scanner;
import java.lang.Math;
public class lab2_bai19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
        while(a%2!=0 && a>0) {System.out.print("khong phai so chan nhap lai "); a = scan.nextInt();}
        int result =0;
        for (int i=2 ; i<=a ;i+=2) {
        	result=result+i;
        }
    	System.out.print(result);

	}
}
