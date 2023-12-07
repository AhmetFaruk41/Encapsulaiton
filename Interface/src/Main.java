import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.println("Kart no giriniz: ");
        String cardNumber = input.next();

        System.out.println("Son kullanma tarihi giriniz: ");
        String date = input.next();

        System.out.println("Güvenlik kodunu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");

        System.out.println("Banka Seçiniz: ");
        int selectBank =input.nextInt();

        switch (selectBank){
            case 1:
                Abankasi aPos = new Abankasi("a Bankası","234432652462","123123");
                aPos.connect("123131");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
            default:
                System.out.println("Geçerli banka giriniz!!");
        }


    }
}