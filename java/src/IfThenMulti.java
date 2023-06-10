import java.util.Scanner;

public class IfThenMulti {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);

        int bilangan = baca.nextInt();

        if (bilangan % 2 == 0 && bilangan > 0){
            System.out.println(bilangan);
        }else{

        }

        baca.close();
    }
}
