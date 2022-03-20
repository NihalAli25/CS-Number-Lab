import java.util.Scanner;

public class VolumeOfConeJava {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double radius = key.nextDouble();
        double height = key.nextDouble();

        System.out.println("Volume of cone: " + 3.14 * (radius * radius) * height / 3);
    }
}
