import java.util.Scanner;
public class IfThenCase {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);

        int angka = baca.nextInt();

        if (angka >= 0 && angka <= 9){
            System.out.println("satuan");
        }else if (angka >= 10 && angka <= 99){
            System.out.println("puluhan");
        }else if (angka >= 100 && angka <= 999){
            System.out.println("ratusan");
        }else if (angka >= 1000 && angka <= 9999){
            System.out.println("ribuan");
        }else if (angka >= 10000 && angka <= 99999){
            System.out.println("puluhribuan");
        }
        baca.close();
    }
}
