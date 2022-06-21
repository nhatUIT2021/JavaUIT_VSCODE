import java.util.Scanner;
public class lab3_bai6 {
    static void innsofibo(int n)
    {
        int f1 = 0, f2 = 1, i;
 
        if (n < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < n; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so a: ");
        // Character input
        int n = scan.nextInt();
        innsofibo(n);
    }
}
