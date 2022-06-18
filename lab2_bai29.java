
public class lab2_bai29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int tongnghiem=0;
		for (int i =0; i<= 979/2; i+=1) {

            for (int j =0; j<= 979/7; j++){

                for (int k =0; k<= 979/9; k++)
                {
                    if((2*i + 7*j +9*k) ==979  && i+j+k>tongnghiem) {System.out.println(i +" "+j+ " "+k);tongnghiem=i+j+k;}
                }

            }
        }

        System.out.println(tongnghiem);

	}
}
