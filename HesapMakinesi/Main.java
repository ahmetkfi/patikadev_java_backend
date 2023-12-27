package HesapMakinesi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1,number2,select;
        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayiyi giriniz : ");
        number1=input.nextInt();
        System.out.print("İkinc sayiyi giriniz : ");
        number2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi Seçiniz : ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam :"+(number1+number2));
                break;
            case 2:
                System.out.print("Çıkartma :"+(number1-number2));
                break;
            case 3:
                System.out.print("Çarpım :"+(number1*number2));
                break;
            case 4:
                System.out.print("Bölme :"+(float)(number1/number2));
                break;
        }

    }
}
