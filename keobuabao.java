import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

public class keobuabao {

	public static void main(String[] args) {
		int choi=1;
			
		while (choi==1) {
			// TODO Auto-generated method stub
		    Random rand = new Random(); //instance of random class
			String[] keobuabao = {"keo","bua", "bao"};
		    //display the length
		    int ketquamaychon = rand.nextInt(2);
		    
		    //nguoi choi chon
		    Scanner myObj  = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("vui long nhap vao keo hoac bua hoac bao");
		    String nguoichoichon = myObj .nextLine();  // Read user input
		    System.out.println("nguoi choi chon " + nguoichoichon);  // Output user input
	
		    //search trong array nguoi choi chon ket qua thu may
		    boolean found = false;
	        int indexnguoichoichon = 0;
	        String searchStr = nguoichoichon;
	        
	        for (int i = 0; i <keobuabao.length; i++) {
	            if(searchStr.equals(keobuabao[i])) {
	            	indexnguoichoichon = i; found = true; 
	                 break;
	                 }
	             }
	        
	        if (found) {
	        	
		        if (indexnguoichoichon == ketquamaychon+1) {
		        	System.out.println("nguoi choi thang, nguoi choi chon "+ nguoichoichon +" may chon ket qua " +keobuabao[ketquamaychon]);
		        	System.out.println( "Vui long input 1 neu muon choi lai hoac 0 de out");

		        }	else if (indexnguoichoichon + 1 == ketquamaychon) {
		        	System.out.println("nguoi choi thua may , nguoi choi chon "+ nguoichoichon +" may chon ket qua " +keobuabao[ketquamaychon]);
		        	System.out.println( "Vui long input 1 neu muon choi lai hoac 0 de out");
		        }	else if (indexnguoichoichon == ketquamaychon +2) {
		        	System.out.println("nguoi choi thua may , nguoi choi chon "+ nguoichoichon +" may chon ket qua " +keobuabao[ketquamaychon]);
		        	System.out.println( "Vui long input 1 neu muon choi lai hoac 0 de out");

		        }	else if (indexnguoichoichon +2 == ketquamaychon) {
		        	System.out.println("nguoi choi thang may, nguoi choi chon "+ nguoichoichon +" may chon ket qua " +keobuabao[ketquamaychon]);
		        	System.out.println( "Vui long input 1 neu muon choi lai hoac 0 de out");

		        }	else if (indexnguoichoichon  == ketquamaychon) {
		        	System.out.println("nguoi choi voi may hoa nhau, nguoi choi chon "+ nguoichoichon +" may chon ket qua " +keobuabao[ketquamaychon]);
		        	System.out.println( "Vui long input 1 neu muon choi lai hoac 0 de out");

		        }
		        
	        }
	        
	        else {System.out.println( "Su lua chon cua nguoi choi khong hop le vui long input 1 neu muon choi lai hoac 0 de out");}
	        
	        Scanner scan = new Scanner(System.in);
	        choi= scan.nextInt();
	        

        
		}
	}
}
