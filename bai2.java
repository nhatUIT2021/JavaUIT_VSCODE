
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap so 2: ");
        int num2 = scan.nextInt();

        scan.close();
        int tong=num1+num2;
        int hieu=num1-num2;
        int tich = num1*num2;
        float thuong= (num1/(num2*1.0f));
        //System.out.print(thuong);

        double roundOff = Math.round(thuong * 100.0) / 100.0;

        System.out.print("gia tri tong: " +tong +" hieu: " +hieu +" tich " + tich +" thuong "+ roundOff);

	}

}
