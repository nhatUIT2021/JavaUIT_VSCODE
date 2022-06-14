import java.util.Scanner;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap ky tu: ");
        String txt = scan.nextLine();
        
        
        scan.close();

        System.out.println(txt.toUpperCase());

	}

}