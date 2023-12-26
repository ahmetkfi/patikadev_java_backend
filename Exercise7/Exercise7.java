package Exercise7;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        float kg_armut,kg_elma,kg_domates,kg_muz,kg_patlican;
        float p_armut=2.14f,p_elma=3.67f,p_domates=1.11f,p_muz=.95f,p_patlican=5.0f,totalPrice;
        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        kg_armut=input.nextFloat();
        System.out.print("Elma Kaç Kilo ? ");
        kg_elma=input.nextFloat();
        System.out.print("Domates Kaç Kilo ? ");
        kg_domates=input.nextFloat();
        System.out.print("Muz Kaç Kilo ? ");
        kg_muz=input.nextFloat();
        System.out.print("Patlican Kaç Kilo ? ");
        kg_patlican=input.nextFloat();

        totalPrice=(kg_domates*p_domates)+(kg_elma*p_elma)+(kg_armut*p_armut)+(kg_muz*p_muz)+(kg_patlican*p_patlican);

        System.out.print("Toplam Tutar : "+totalPrice+" TL");



    }
}
