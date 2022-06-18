import java.util.Scanner;

public class lab2_bai15 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input so : ");
        int x = in.nextInt();
        boolean sochinhphuong =false;
        for (int i=0; i<=x/2; i++) {if(i*i ==x){sochinhphuong=true;break;}}
        if(sochinhphuong){ System.out.println("dung la so chinh phuong");  }
        else { System.out.println("khong la so chinh phuong");  }
    }
}
