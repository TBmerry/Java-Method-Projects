import java.util.Scanner;
//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

 class PrimeNumberProject {

        static void primeNumber(int a, int b){
            if (a==b) {
                System.out.println(a + " Asal Sayıdır.");
                return;
            }else if (a%b == 0){
                System.out.println(a + " Asal Sayı Değildir.");
                return;
            }
            primeNumber(a , b+1);
        }

    public static void main(String[] args) {
            int b = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sorgulamak İstediğiniz Sayıyı Giriniz : ");
        int a = input.nextInt();

        primeNumber(a, b);
    }
}