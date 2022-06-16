import java.util.Scanner;

public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub12 10 2020

        Scanner scan = new Scanner(System.in);
        System.out.print("nhap ngay thang nam sinh: ");
        String str = scan.nextLine();
        String[] splited = str.split("\\s+");
        String nam =splited[2].substring(2,4);
        System.out.println(splited[0] + "/" +splited[1]+"/"+splited[2]);
        System.out.println(splited[0] + "/" +splited[1]+"/"+nam);
        System.out.println(splited[2] + "/" +splited[1]+"/"+splited[0]);


	}

}
