package Exercise6;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float boy,vki;
        int kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=input.nextInt();

        vki=kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz : "+vki);

    }
}
