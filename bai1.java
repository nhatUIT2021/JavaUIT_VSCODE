import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap so 2: ");
        int num2 = scan.nextInt();

        System.out.print("nhap so 3: ");
        int num3 = scan.nextInt();
        
        System.out.print("nhap so 4: ");
        int num4 = scan.nextInt();
        scan.close();

        float tb= (num1+num2+num3+num4)/4.0f;
        System.out.print("gia tri trung binh: " +tb);

	}

}
