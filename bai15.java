import java.util.Scanner;
import java.lang.Math;
public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a=1*1.0f/64*1.0f;

        float b=8*1.0f/27*1.0f;
        float c=1*1.0f/3*1.0f;

        double result = Math.pow(32,0.2)-Math.pow(a,-0.25)+Math.pow(b,c ) ;

        
        System.out.print(result);
	}
}

