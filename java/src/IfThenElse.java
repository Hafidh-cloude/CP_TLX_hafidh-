import java.util.Scanner;
public class IfThenElse {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        int bilangan = baca.nextInt();

        if (bilangan % 2 == 0 && bilangan > 0){
            System.out.println("positif");
        }else if  (bilangan < 0){
            System.out.println("negatif");
        }else if (bilangan >= 0) {
            System.out.println("nol");
        }
        baca.close();
    }
}
