import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("nhap can nang : ");
	    int cannang = scan.nextInt();
	    System.out.print("nhap chieu cao : ");
	    float chieucao = scan.nextFloat();
	    float bmi = cannang/chieucao;
	    System.out.println(bmi);
	}

}
