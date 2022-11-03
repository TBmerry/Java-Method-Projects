import java.util.Scanner;

public class MainAdvancedCalculatorProject {

    static int toplama(int a, int b){
        int sonuc = a+b;
        System.out.println("Toplam Sonucu : " + sonuc);
        return sonuc;
    }

    static int cikarma(int a, int b){
        int sonuc = a-b;
        System.out.println("Çıkarma Sonucu : " + sonuc);
        return sonuc;
    }

    static int carpma(int a, int b){
        int sonuc = a*b;
        System.out.println("Çarpma Sonucu : " + sonuc);
        return sonuc;
    }

    static int bolme(int a, int b){
        if (b == 0) {
            System.out.println("Bir sayı 0'a bölünmez!!");
            return 0;
        }
        int sonuc = a/b;
        System.out.println("Bölme Sonucu : " + sonuc);
        return sonuc;
    }

    static void usAlma(int a, int b){
        int sonuc = 1;
        for (int i = 1; i <= b; i++){
            sonuc *= a;
        }
        System.out.println("Üs Alma Sonucu : " + sonuc);
    }

    static void fact(int a){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Hesaplamak İstediğiniz Sayıyı Giriniz : ");
        a = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++){
            sonuc *= i;
        }
        System.out.println("Faktöriyel Sonucu : " + sonuc);
    }

    static int mode(int a, int b){
        int sonuc = a % b;
        System.out.println("Mod Alma Sonucu : " + sonuc);
        return sonuc;
    }

    static void trabzon(int a){
        Scanner zort = new Scanner(System.in);
        System.out.println("Kendi düşündüğünüz oranı giriniz : ");
        a = zort.nextInt();
        a = 1;
        int sonuc = 0;
        System.out.println("Gerçekten düşündünüz mü ? İşte sonuç => " + sonuc);
    }

    static void karealancevre(int a){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Kenar Uzunluğu Giriniz : ");
        a = input.nextInt();
        System.out.println("Kare Alanı : " + a*a);
        System.out.println("Kare Çevresi : " + a*4 );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama İşlemi\n"
                + "6- Mod Alma İşlemi\n"
                + "7- Faktoriyel Hesaplama İşlemi\n"
                + "8- Kare Alan ve Çevre Hesaplama\n"
                + "9- Trabzonsporun Avrupayı Kazanma Oranı Hesaplama\n"
                + "0- Uygulamadan Çıkış";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem Seçiniz : ");
            select = input.nextInt();

            if (select > 9) {
                System.out.println("Lütfen Geçerli Rakamı Giriniz!");
                break;
            }

            if (select == 0) {
                break;
            }

            if (select <= 6) {
                System.out.print("İlk Sayınızı Giriniz : ");
                int a = input.nextInt();
                System.out.print("İkinci Sayınızı Giriniz : ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        toplama(a, b);
                        break;

                    case 2:
                        cikarma(a, b);
                        break;

                    case 3:
                        carpma(a, b);
                        break;

                    case 4:
                        bolme(a, b);
                        break;

                    case 5:
                        usAlma(a, b);
                        break;

                    case 6:
                        mode(a, b);
                        break;

                    default:
                        System.out.println("Geçersiz İşlem !!!");
                }
            } else {
                System.out.println("Lütfen Başlamak İçin 1 Rakamına Basınız.");
                int a = input.nextInt();

                if (a != 1){
                    System.out.println("Yanlış Rakam Tuşladınız.Uygulamadan Çıkartılıyorsunuz!");
                    break;
                }

                switch (select) {
                    case 7:
                        fact(a);
                        break;

                    case 8:
                        karealancevre(a);
                        break;

                    case 9:
                        trabzon(a);
                        break;


                    default:
                        System.out.println("Geçersiz İşlem !!!");

                }
            }
        }


            System.out.println("İyi Günler. Tekrar Görüşmek Üzere");


        }
    }
