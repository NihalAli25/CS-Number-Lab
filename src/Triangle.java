import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter height: ");
        System.out.println("Enter base: ");
        double height = key.nextDouble();
        double base = key.nextDouble();

        System.out.println("Area for triangle: " + (height * base) / 2);


    }

    }
