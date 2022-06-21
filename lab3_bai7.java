import java.util.Scanner;
public class lab3_bai7 {
    static void tinhchuvidientich(int dai, int rong)
    {
        
        System.out.println("chu vi: "+ (dai*2+rong*2));
        System.out.println("dien tich: "+ (dai*rong));

    }
    static void inhinhchunhat(int dai, int rong)
    {
        
        
        for (int i=1; i<= rong; i++)
        {
            if(i==1 || i==rong)
            {
                for(int j=1 ; j<= dai ; j++)
                {
                   
                        System.out.print("*");
                                    
                          
                    }
            }

            else
            {
                for(int j=1 ; j<= dai ; j++)
                {
                    if(j==1 || j== dai) 
                    {
                        System.out.print("*");
                                    
                    }
                    else {
                        System.out.print(" "); }              
                    }
            }

            System.out.println();
        }
}

    
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        // Character input
        int dai = scan.nextInt();
        System.out.print("nhap chieu rong: ");
        // Character input
        int rong = scan.nextInt();
        tinhchuvidientich(dai,rong);
        inhinhchunhat(dai,rong);
    }
}
