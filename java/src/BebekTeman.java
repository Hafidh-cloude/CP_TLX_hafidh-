import java.util.Scanner;
public class BebekTeman {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        int A = baca.nextInt();
        int B = baca.nextInt();
        int C = A / B;
        int D = A % B;

        System.out.println("masing-masing " + C);
        System.out.println("bersisa " + D);
    
        baca.close();
    }
}
