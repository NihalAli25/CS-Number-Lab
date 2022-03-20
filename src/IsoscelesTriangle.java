import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double base = key.nextDouble();
        double height = key.nextDouble();

        System.out.println("Area of isosceles triangle: " + (base * height) / 2);
    }
}
