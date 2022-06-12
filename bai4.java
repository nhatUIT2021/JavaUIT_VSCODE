import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so : ");
        int num = scan.nextInt();
        
        	int donvi= num%10;
        	int chuc=num/10;		
        
        System.out.print(chuc +" + " +donvi+ "="+ (chuc+donvi));

	}

}
