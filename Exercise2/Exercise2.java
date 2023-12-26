package Exercise2;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen para değerini giriniz : ");
        int price=input.nextInt();
        float kdv=(price>999)?0.08f:0.18f;
        float kdvli=(price*kdv)+price;
        System.out.println("KDV'siz fiyat= "+price);
        System.out.println("KDV'li fiyat= "+kdvli);
        System.out.println("KDV'tutarı= "+kdv);
    }
}
