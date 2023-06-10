import java.util.Scanner;

public class FloorCeiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();

        // Casting bilangan riil ke bilangan bulat
        int floor = (int) N; 

        int ceiling;
        if (N > floor) {
            ceiling = floor;
        } else {
            ceiling = floor;
        }

        System.out.println(floor + 1 + " " + ceiling);

        input.close();
    }
}
