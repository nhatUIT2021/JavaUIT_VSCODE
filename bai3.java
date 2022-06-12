import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub



        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap so 2: ");
        int num2 = scan.nextInt();

        scan.close();
        int phannguyen=num1/num2;
        int phandu = num1%num2;
        //System.out.print(thuong);


        System.out.print("gia tri phan nguyen: " +phannguyen +" phan du: " +phandu);

	}

}

