import java.util.Scanner;

public class lab2_bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap gio: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap phut: ");
        int num2 = scan.nextInt();

        System.out.print("nhap giay: ");
        int num3 = scan.nextInt();
        scan.close();

        boolean test= true;
        if(num1>24 || num1 <0 ) {test= false;}
        if(num2>60 || num2 <0 ) {test= false;}
        if(num3>60 || num3 <0 ) {test= false;}


        if(test){		
        System.out.print("gio hop le ");}
        else{        System.out.print("gio khong hop le ");}
    
	}

}
