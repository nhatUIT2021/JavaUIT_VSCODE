
public class lab4_bai2 {
    public static void main(String [] args){
        toado a =new toado(1,2);
        toado b =new toado(3,4);
        System.out.println(a.a +" "+ a.b);
        a.khoangcach(b);
        b=a.saochep();
        System.out.println(b.a +" "+ b.b);

    }
}
