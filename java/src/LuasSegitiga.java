import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        double alas = baca.nextInt();
        double tinggi = baca.nextInt();
        double luas = (0.5 * alas) * tinggi;

        System.out.println(luas + "0");

        baca.close();

    }
}
