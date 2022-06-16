import java.util.Scanner;

public class lab2_bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap so 2: ");
        int num2 = scan.nextInt();

        System.out.print("nhap so 3: ");
        int num3 = scan.nextInt();
        scan.close();

        int max= num1;
        if(num2>max) {max=num2;}
        if(num3>max) {max=num3;}


        		
        System.out.print("gia tri max: " +max);
	}

}