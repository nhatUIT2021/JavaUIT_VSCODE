import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class lab3_bai10 {
    static void nhapmang(float [][] arr, float min ,float max){ 
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = min + (max-min)*rd.nextFloat();}

        }
    }

    static void xuatmang(float [][] arr){ 
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print( arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void kiemtravuong(float [][] arr){ 
        if(arr.length==arr[0].length){
            System.out.println("ma tran vuong");
        }else{
            System.out.println("ma tran khong vuong");
        }
    }

    static void timmax(float [][] arr){ 
        float max=-40;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; ++j) {
                if(arr[i][j] >max){ max =arr[i][j];}
            }
        }
        System.out.println(max);

    }

    static void xuatphantuduongcheochinh(float [][] arr){ 
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; ++j) {
                if(i==j)
                {System.out.print( arr[i][j] +" ");}
            }
            System.out.println();
        }
    }
    static void xuatphantuduongcheophu(float [][] arr){ 
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; ++j) {
                if(i+j ==arr.length+1)
                {System.out.print( arr[i][j] +" ");}
            }
            System.out.println();
        }
    }

    static void timmintungdong(float [][] arr){ 
        for (int i = 0; i < arr.length; i++){
            float min =80;
            for(int j = 0; j < arr[i].length; ++j) {
                if(arr[i][j] <min){ min =arr[i][j];}
            }
            System.out.println(min);
        }
    }

    static void timmaxtungcot(int cot,float [][] arr){ 
        for (int i = 0; i < cot; i++){


            float maxm = arr[0][i];
            for (int j = 1; j < arr[i].length; j++)
                if (arr[j][i] > maxm)
                    maxm = arr[j][i];
 
            System.out.println(maxm);
        }
    }
    static void checkmangchan(float [][] arr){ 
        boolean check=true;
        for (int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr[i].length; ++j) {
                if(arr[i][j] %2 !=0){ check=false; break;}
            }
            if(check){System.out.println("mang chan");}
            else {System.out.println("mang khong chan")}
        }
    }
    static boolean checksonguyento(float a){
        boolean check =true;
        for(int i =2; i<=a/2 ;i++){if (a%i == 0) {check=false;return check; }}
        return check;
    }
    static void insognguyento(float [][] arr){ 
        for (int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr[i].length; ++j) {
                if(checksonguyento(arr[i][j])){System.out.println(arr[i][j]);}
            }
        }
    }
    static void demtanxuat(float arr[][])
    {
        Map<Float, Integer> mp = new HashMap<>();
  
  
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; ++j) {

            if (mp.containsKey(arr[i][j])) 
            {
                mp.put(arr[i][j], mp.get(arr[i][j]) + 1);
            } 
            else
            {
                mp.put(arr[i][j], 1);
            }
        }

    }
        for (Map.Entry<Float, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " tan xuat " + entry.getValue());
        }
    }
        
    public static void main (String[] args) 
    {         

      // declares an Array of integers.
      float[][] arr;
      float max=79;
      float min=-39;

      Random rand = new Random(); //instance of random class
      int upperbound = 25;
      int int_random_dong = rand.nextInt(upperbound);     
      int int_random_cot = rand.nextInt(upperbound);     

      arr = new float[int_random_dong][int_random_cot];
      nhapmang(arr, min, max);
      Scanner scan = new Scanner(System.in);
      System.out.print("nhap ten bai toan: ");
      System.out.println("xuat mang: ");
      System.out.println("tim phan tu lon nhat: ");
      System.out.println("kiem tra ma tran co vuong: ");
      System.out.println("in ra cac phan tu tren duong cheo chinh: ");
      System.out.println("in ra cac phan tu tren duong cheo phu: ");
      System.out.println("tim gia tri nho nhat tren tung dong cua mang: ");
      System.out.println("tim gia tri nho nhat tren tung cot cua mang: ");
      System.out.println("kiem tra mang toan gia tri chan: ");
      System.out.println("liet ke cac so nguyen to trong mang: ");
      System.out.println("In tan xuat cua cac so trong mang: ");

      int num = scan.nextInt();
      switch(num){
        case 1: xuatmang(arr);break;
        case 2: kiemtravuong(arr);break;
        case 3: timmax(arr);break;
        case 4: xuatphantuduongcheochinh(arr);break;
        case 5: xuatphantuduongcheophu(arr);break;
        case 6: timmintungdong(arr);break;
        case 7: timmaxtungcot(int_random_cot,arr);break;
        case 8: checkmangchan(arr);break;
        case 9: insognguyento(arr);break;
        case 10: demtanxuat(arr);break;

      
    }
}
}