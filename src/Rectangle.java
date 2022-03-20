import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double length = key.nextDouble();
        double width = key.nextDouble();

        System.out.println("Area of the rectangle is: " + length * width);


    }
}
