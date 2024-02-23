import java.util.Scanner;

//Kullanıcıdan veri almak için Scanner sınıfını projeye dahil ettik.

public class Main {
    public static void main(String[] args) {

        //değişkenlerimizi atadık
        int n1, n2, select;

        Scanner input = new Scanner(System.in);


        //Kullanıcıdan verileri alıyoruz.
        System.out.print("1. Değer: ");
        n1 = input.nextInt();

        System.out.print("2. Değer: ");
        n2 = input.nextInt();

        //Kullanıcının işlem seçmesi için 4 işlem seçeneğini yazdırıyoruz.
        System.out.println("1-Toplama işlemi\n2-Çıkarma işlemi\n3-Çarpma işlemi\n4-Bölme işlemi");
        select = input.nextInt();


        //Switch Case yapısını kullanarak 4 işleme ayrı değerler atayarak kullanıcının seçimine göre işlemler yapıyoruz.
        switch (select) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;

                /*Bölme işleminde 0 bölünmez ve bölmez. Olur da kullanıcı sıfır değerini girerse
                 Switch içinde Switch kullanarak kullanıcıya uyarı mesajı verip programı durduruyoruz.
                 */
            case 4:
                switch ((n2 == 0) ? "zero" : "nonzero") {
                    case "zero":
                        System.out.println("Hata: İkinci sayı 0 olamaz!");
                        break;
                    case "nonzero":
                        int bolum = n1 / n2;
                        System.out.print("Bölüm: " + bolum);
                        break;
                }
                break;
            default:
                System.out.print("Hatalı işlem");

        }

    }
}