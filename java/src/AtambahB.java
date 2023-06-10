import java.util.Scanner;
public class AtambahB {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        int A = baca.nextInt();
        int B = baca.nextInt();

        System.out.println(A + B);

        baca.close();
    }
}
