import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // gişe uygulaması tc si dogru ise numara versin yanlış ise uyarı versin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gişe Uygulamasına hoş geldiniz");
        System.out.println("Lütfen TC giriniz :");
        String tckn = scanner.nextLine();

        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);


    }
}