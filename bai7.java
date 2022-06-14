import java.util.Scanner;
public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao ban kinh: ");
        int num1 = scan.nextInt();
        
        

        scan.close();

        float chuvi=num1*2*3.14f;
        float dientich=num1*num1*3.14f;

       
        //System.out.print(thuong);


        System.out.print("gia tri chu vi: " +chuvi + " gia tri dien tich "+ dientich);

	}

}