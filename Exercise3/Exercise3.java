package Exercise3;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
    int a,b,c;
    double u,cevre,alan;
    Scanner input=new Scanner(System.in);
    System.out.print("Ucegenin 1. kenar uzunlugunu giriniz : ");
    a=input.nextInt();
    System.out.print("Ucegenin 2. kenar uzunlugunu giriniz : ");
    b=input.nextInt();
    System.out.print("Ucegenin 3. kenar uzunlugunu giriniz : ");
    c=input.nextInt();
    u= (double) (a + b + c) /2;
    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.print("Ucegenin Alanı = "+alan );
    }
}
