import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao gio: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap phut : ");
        int num2 = scan.nextInt();

		System.out.print("nhap giay : ");
        int num3 = scan.nextInt();

        scan.close();
        int giay=num1*3600+num2*60+num3;
       
        //System.out.print(thuong);


        System.out.print("gia tri giay: " +giay);

	}

}

