import java.util.Scanner;
import java.util.Arrays;   
public class lab2_bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("nhap so 1: ");
        int num1 = scan.nextInt();
        
        System.out.print("nhap so 2: ");
        int num2 = scan.nextInt();

        System.out.print("nhap so 3: ");
        int num3 = scan.nextInt();
        int i;
        if(num1>num2) {i=num1; num1=num2; num2=i;}
        if(num2>num3) {i=num2; num2=num3; num3=i;}
        System.out.println(num1 +" "+ num2 + " " + num3);

        Scanner scan1 = new Scanner(System.in);
        System.out.print("nhap so : ");
        String str = scan1.nextLine();
        char[] ch = new char[str.length()];
        for (int j = 0; j < str.length(); j++) {
            ch[j] = str.charAt(j);
        }

        int[] in =new int[str.length()];
        for (int j = 0; j < str.length(); j++) {
            in[j] = str.charAt(j)- '0';
        }
        Arrays.sort(in);   
        for (int c : in){
            System.out.print(c);
        }
        scan.close();

	}

}
