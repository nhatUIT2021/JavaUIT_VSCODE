import java.util.Random;
import java.util.Scanner;
public class lab3_bai8 {
    static void nhapmang(float [] arr, float min ,float max){ 
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < arr.length; i++) {
        arr[i] = min + (max-min)*rd.nextFloat();}

    }

    static void xuatmang(float [] arr){ 
      for (int i = 0; i < arr.length; i++)
        {System.out.println("gia tri tai vi tri " + i + 
                                   " : "+ arr[i]);  }       
 }

 static void xuatvitriam(float [] arr){ 
    for (int i = 0; i < arr.length; i++)
        {if(arr[i]<0){System.out.println("gia tri tai vi tri " + i + " : "+ arr[i] +"la gia tri am");}}
              
}
static void xuatvitrichan(float [] arr){ 
    for (int i = 0; i < arr.length; i++)
        {if(arr[i]%2 == 0){System.out.println("gia tri tai vi tri " + i + " : "+ arr[i] +"la gia tri chan");}}
              
}
static void timgiatrilonhat(float [] arr){
    float max=-100 ;
    for (int i = 0; i < arr.length; i++)
        {if(arr[i] > max){ max = arr[i]; }}

    System.out.println("gia tri lon nhat la " +  max);
              
}
//cau f
static void timgiatriduongdau(float [] arr){
    float duongdau=-1 ;
    for (int i = 0; i < arr.length; i++)
        {if(arr[i] > 0){ duongdau = arr[i]; break; }}
    System.out.println("gia tri lon nhat la " +  duongdau);
              
}
//cau g
static void timsochancuoicung(float [] arr){
    float chancuoi=-1 ;
    for (int i = arr.length-1; i >=0; i--)
        {if(arr[i] %2 == 0){ chancuoi = arr[i]; break; }}
    System.out.println("gia tri lon nhat la " +  chancuoi);              
}

static void timgiatrinhonhat(float [] arr){
    float min=100 ;
    int pos=0;
    for (int i = 0; i < arr.length; i++)
        {if(arr[i] < min){ min = arr[i]; pos=i; }}

    System.out.println("gia tri nho nhat la " +  min + " vi tri cua no la: "+ pos);
              
}
static void xuatvitrichan_caui(float [] arr){ 
    for (int i = 0; i < arr.length; i++)
        {if(  ((int)arr[i])%2 == 0){System.out.println("gia tri tai vi tri " + i + " : "+ arr[i] +"la gia tri chan");}}
              
}

    public static void main (String[] args) 
    {         

      // declares an Array of integers.
      float[] arr;
      float max=99;
      float min=-99;

      Random rand = new Random(); //instance of random class
      int upperbound = 25;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound);     
      // allocating memory for 5 integers.
      arr = new float[int_random];

      Scanner scan = new Scanner(System.in);
      System.out.print("nhap ten bai toan: ");
      int num = scan.nextInt();
      switch(num){
        case 1: nhapmang(arr, min, max);
        case 2: xuatmang(arr);
        case 3: xuatvitriam(arr);
        case 4: xuatvitrichan(arr);
        case 5: timgiatrilonhat(arr);
        case 6: timgiatriduongdau(arr);
        case 7: timsochancuoicung(arr);
        case 8: timgiatrinhonhat(arr);
        case 9: xuatvitrichan_caui(arr);

      }

          
           
    }
}

