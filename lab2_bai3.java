import java.util.Scanner;

public class lab2_bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("nhap so 1: ");
        int num = scan.nextInt();
        if(num==0) {System.out.print("khong ");}
        else if(num==1) {System.out.print("mot ");}
        else if(num==2) {System.out.print("hai ");}
        else if(num==3) {System.out.print("ba ");}
        else if(num==4) {System.out.print("bon ");}
        else if(num==5) {System.out.print("nam ");}
        else if(num==6) {System.out.print("sau ");}
        else if(num==7) {System.out.print("bay ");}
        else if(num==8) {System.out.print("tam ");}
        else if(num==9) {System.out.print("chin ");}
        else  {System.out.print("khong doc duoc ");}
	}

}
