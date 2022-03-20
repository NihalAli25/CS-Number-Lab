import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double a = key.nextDouble();

        System.out.println("Total Surface Area Of Cube: " + 6 * (a * a));
    }
}
