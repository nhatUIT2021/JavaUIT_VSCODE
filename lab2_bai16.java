import java.util.Scanner;

public class lab2_bai16 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input so : ");
        int x = in.nextInt();
        boolean songuyento =true;
        for (int i=2; i<=x/2; i++) {if(x%i ==0){songuyento=false;break;}}
        if(songuyento){ System.out.println("dung la so nguyen to");  }
        else { System.out.println("khong la so nguyen to");  }
    }
}