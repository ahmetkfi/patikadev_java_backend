package UserLogin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,select;
        Scanner input=new Scanner(System.in);


        System.out.print("Kullanıcı Adınız : ");
        userName=input.nextLine();
        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if (userName.equals("ahmet") && password.equals("123")){
            System.out.print("Başarılı bir şekilde giriş yaptınız");
        }else {
            System.out.println("Şifre veya kullanıcı adınız hatalı . Şifrenizi sıfırlamak İstermisiniz ? \n Evet(y) Hayır(n)");
            select=input.nextLine();
            if(select.equals("y")){
                System.out.print("Lütfen yeni şifrenizi giriniz -> ");
                password=input.nextLine();
                while (password.equals("123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz -> ");
                    password=input.nextLine();
                    if (!password.equals("123")){
                        System.out.print("Şifre oluşturuldu");
                        break;
                    }
                }
            }
        }

    }
}
