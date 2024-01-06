package SinifGecmeDurumu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int dersSayisi=0;
        int not=0;
        double ort;

        System.out.print("Lütfen Matematik notunuzu giriniz : ");
        mat=input.nextInt();
        if(mat>0 && mat<=100){
            not=mat+not;
            dersSayisi=dersSayisi+1;
        }
        System.out.print("Lütfen Fizik notunuzu giriniz : ");
        fizik=input.nextInt();
        if(fizik>0 && fizik<=100){
            not=fizik+not;
            dersSayisi=dersSayisi+1;
        }
        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        turkce=input.nextInt();
        if(turkce>0 && turkce<=100){
            not=turkce+not;
            dersSayisi=dersSayisi+1;
        }
        System.out.print("Lütfen Kimya notunuzu giriniz : ");
        kimya=input.nextInt();
        if(kimya>0 && kimya<=100){
            not=kimya+not;
            dersSayisi=dersSayisi+1;
        }
        System.out.print("Lütfen Muzik notunuzu giriniz : ");
        muzik=input.nextInt();
        if(muzik>0 && muzik<=100){
            not=muzik+not;
            dersSayisi=dersSayisi+1;
        }

        ort=(double) not/dersSayisi;

        System.out.println("ortalamanız : "+ ort);
        if (ort>55){
            System.out.print("Geçme Durumu : Tebrikler Sınıfı Geçtiniz.");
        }else {
            System.out.print("Geçme Durumu : Malesef Sınıfı Geçemediniz. ");
        }






    }

}
