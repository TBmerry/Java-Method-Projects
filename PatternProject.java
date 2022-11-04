import java.util.Scanner;
//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

public class PatternProject {
    static void  desen(int a, int tempNumber, int sonuc) {

        if (tempNumber > 0) {
            System.out.print(sonuc + " ");
            sonuc -= 5;

            if (sonuc <= 0) {
                tempNumber = sonuc;
            }

        } else if (tempNumber <= 0) {
            System.out.print(sonuc + " ");
            sonuc += 5;

            if(sonuc == a) {
                System.out.print(sonuc + " ");
                return;
            }

        }

        desen(a,tempNumber, sonuc);

    }

    public static void main(String[] args) {

        int sonuc, tempNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int a = input.nextInt();

        sonuc = a;
        tempNumber = a;

        desen(a, sonuc,tempNumber);

    }
}