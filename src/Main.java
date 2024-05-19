import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Armstrong sayi = 371 = 3^3 + 7^3 + 1^3 şeklinde bulunur.
        Scanner sc = new Scanner(System.in);

        //ilk öncelikle kullanıcıdan sayı girmesini isteyelim.
        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        //Şimdi kullanıcıdan basamk sayısını isteyelim.

        /*System.out.print("Girdiğiniz sayının basamak sayınısı giriniz: ");
        int BasamakSayisi = sc.nextInt();*/

        //Kullanıcıdan istemeden girilen sayının basamak sayısını bulmak.
        int BasamakSayisi =0;
        while (true)
        {
            if (sayi>0){
                sayi = sayi / 10;
                BasamakSayisi++;
            }
            else
                break;
        }

        int geciciSayi = sayi;//Sayı değeri yerine gecici değer ile işlem yapaılım.
        int toplam = 0;
        do {
            //her bir sayısının basamak değerini bulmak
            int basamakDegeri = geciciSayi %10;
            geciciSayi = geciciSayi / 10;

            //Math kütüphanesi yardımıyla üs alma işlemi
            toplam = (int) (toplam + Math.pow(basamakDegeri,BasamakSayisi));

        }while (geciciSayi>0);
        if (sayi == toplam)
        {
            System.out.println("Girilen sayı bir armstrong sayısıdır.");
        }
        else {
            System.out.println("Girilen sayı bir armstrong sayısı değildir!!!");
        }

        }


}

