import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String options = " 1 Toplama \n" + " 2 Çıkarma \n" + " 3 Çarpma \n" + " 4 Bölme ";

        double a, b, islem, sonuc;


        System.out.print(" Sayı 1 = ");
        a = scan.nextDouble();

        System.out.print(" Sayı 2 = ");
        b = scan.nextDouble();


        while (true) {
            System.out.println(options);
            System.out.print(" Yapmak istediğiniz işlemi seçiniz : ");
            islem = scan.nextDouble();
            if (islem < 5 && islem > 0) {
                switch ((int) islem) {
                    case 1:
                        sonuc = a + b;
                        System.out.println(" Sonuç = " + sonuc);
                        break;
                    case 2:
                        sonuc = a - b;
                        System.out.println(" Sonuç = " + sonuc);
                        break;
                    case 3:
                        sonuc = a * b;
                        System.out.println(" Sonuç = " + sonuc);
                        break;
                    case 4:
                        sonuc = a / b;
                        System.out.println(" Sonuç = " + sonuc);
                        break;
                }
                break;
            } else {
                System.out.println("hatalı seçim ");
            }
        }
    }
}

