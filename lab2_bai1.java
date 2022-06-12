import java.util.Scanner;

public class lab2_bai1 {

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

        int min= num1;
        if(num2<min) {min=num2;}
        if(num3<min) {min=num3;}
        if(num4<min) {min=num4;}

        		
        System.out.print("gia tri min: " +min);
	}

}
