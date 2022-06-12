
import java.util.Scanner;
import java.lang.Math;

public class lab2_bai5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
        System.out.print("nhap so b: ");
        int b = scan.nextInt();
        System.out.print("nhap so c: ");
        int c = scan.nextInt();
        
        if(a==0 && b==0 && c==0) {System.out.print("phuog trinh vo so nghiem");}
        else if(a==0 && b==0 && c!=0) {System.out.print("phuog trinh vo  nghiem");}
        
        else if(a==0 && b!=0) {float result = b*(-1.0f)/a;System.out.print(result);}
        
        else if (a!=0) {
        	double delta= Math.pow(b, 2)- 4*a*c;
        	
        	if (delta==0) {System.out.print("phuog trinh co 2 nghiem la x1=x2= "+(-1*b/(2*a)));}
        	else if(delta>0) {System.out.print("phuog trinh co 2 nghiem la x1="+((-1*b +Math.pow(delta, 0.5)) /(2*a)) +" x2= " + ((-1*b -Math.pow(delta, 0.5)) /(2*a)) );}
        	else if(delta<0){System.out.print("phuog trinh vo nghiem");}
        }
        
        
        
        
	}
}
