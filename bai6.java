import java.util.Scanner;
import java.util.Calendar;
public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao nam sinh: ");
        int num1 = scan.nextInt();
        
        

        scan.close();
        int year = Calendar.getInstance().get(Calendar.YEAR);

        int tuoi=year-num1;
       
        //System.out.print(thuong);


        System.out.print("gia tri tuoi: " +tuoi);

	}

}