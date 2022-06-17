import java.util.Scanner;

public class lab2_bai9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("nhap hinh: ");
        char num1 = scan.next().charAt(0);

        if(num1=='n') {
            System.out.print("Tinh P va S cua hinh chu nhat");
            System.out.print("nhap chieu rong");
            int num2 = scan.nextInt();
            System.out.print("nhap chieu daif");
            int num3 = scan.nextInt();
            System.out.println("ket qua P= "+ (num2*2+num3*2) + " S= " +num2*num3);
        }
        if(num1=='v') {
            System.out.print("Tinh P va S cua hinh vuong");
            System.out.print("nhap chieu canh");
            int num2 = scan.nextInt();
            System.out.println("ket qua P= "+ (num2*4) + " S= " +num2*num2);
        }

        if(num1=='v') {
            System.out.print("Tinh P va S cua hinh tron");
            System.out.print("nhap ban kinh ");
            int num2 = scan.nextInt();
            System.out.println("ket qua P= "+ (num2*2*3.14) + " S= " +num2*num2*3.14);
        }
       
    }
}
