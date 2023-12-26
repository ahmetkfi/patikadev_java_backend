package Exercise4;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int km,acilis_ucreti=10;
        double price=2.20f,toplam_ucret;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km=input.nextInt();
        toplam_ucret=(km*price);
        toplam_ucret+=acilis_ucreti;

        toplam_ucret=(toplam_ucret<20)?20:toplam_ucret;

        System.out.println("Odenecek toplam ucret : "+toplam_ucret);


    }
}
