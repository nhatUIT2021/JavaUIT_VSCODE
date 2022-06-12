import java.util.Scanner;

public class lab2_bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scan.nextInt();
        System.out.print("nhap so b: ");
        int b = scan.nextInt();
        if (a!=0) {float result = b*(-1.0f)/a;System.out.print(result);
}
        else if (a==0 && b==0) {        System.out.print("phuog trinh vo so nghiem");}
        else if (a==0 && b!=0) {        System.out.print("phuog trinh vo  nghiem");}


	}
	
}
