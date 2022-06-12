import java.util.Scanner;
import java.lang.Math;
public class bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
       
        System.out.print("nhap so b: ");
        int b = scan.nextInt();
        
        double result1 = (a+b)/(Math.pow(a,1/3)+Math.pow(b,1/3)) ;
        double result2 =  Math.pow(a*b, 1/3) / (Math.pow((Math.pow(a,0.5)- Math.pow(b, 0.5)),2));
        double result =result1- result2;
        System.out.print(result);
	}

}
