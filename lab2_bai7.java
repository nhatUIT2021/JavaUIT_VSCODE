import java.util.Scanner;

public class lab2_bai7 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap ky tu: ");
        char a = scan.next().charAt(0);
        boolean testup= Character.isUpperCase(a);
        if (testup) {a=Character.toLowerCase(a);}
        else {a=Character.toUpperCase(a);}
        
       System.out.print(a);
    
	}
}
