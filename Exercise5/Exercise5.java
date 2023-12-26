package Exercise5;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int r,alpha;
        float alan,cevre,pi=3.14f,dilim_alani;

        System.out.print("Lütfen dairenin yarı çapını giriniz : ");
        r=input.nextInt();
        System.out.println("Lütfen alanını hesaplamak istediğiniz dilimin merkez açısını giriniz : ");
        alpha=input.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;
        dilim_alani=(pi*(r*r)*alpha)/360;

        System.out.println("Dairenin alanı   = "+alan);
        System.out.println("Dairenin cevresi = "+cevre);
        System.out.println("Merkez acısı "+alpha+" derece olan dilimin alanı = "+dilim_alani);

    }
}
