import java.util.Scanner;

public class bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so xe: ");
        int soxe = scan.nextInt();
        int so1=soxe%10;
        soxe=soxe/10;
        int so2=soxe%10;
        soxe=soxe/10;
        int so3=soxe%10;
        soxe=soxe/10;
        int so4=soxe%10;
        soxe=soxe/10;
        int sotong=so1+so2+so3+so4;
        int sonut;
        if (sotong<10) {sonut=sotong;
	} else {sonut=sotong%10;}
        
        System.out.print(sonut);

}}
