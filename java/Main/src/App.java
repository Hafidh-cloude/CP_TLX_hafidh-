import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        int a, b, hasil;

        System.out.println("Masukkan nilai 1 ");
        a = userInput.nextInt();
        System.out.println("Masukkan nilai 2 ");
        b = userInput.nextInt();

        hasil = a+b;
        System.out.println("hasil pertambahan " + hasil);

    }
}
