import java.util.Scanner;
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
public class PowerNumberProject {

    static void power(int a, int b){
        int sonuc = 1;
        for (int i = 1; i <= b; i++){
            sonuc *= a;
        }
        System.out.println("İstediğiniz ifade => " + sonuc);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b = input.nextInt();

        power(a, b);
    }
}