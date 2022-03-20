import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double base = key.nextDouble();
        double side = key.nextDouble();

        System.out.println("Perimeter Of Parallelogram: " + (2 * (base + side)));
    }
}
