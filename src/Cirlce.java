import java.util.Scanner;

public class Cirlce {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double pie = 3.14159;
         float radius = key.nextFloat();

        System.out.println("Area of the circle: " + pie * (radius * radius));
    }
}
