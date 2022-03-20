import java.util.Scanner;

public class PTR {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double i = key.nextDouble();
        double p = key.nextDouble();
        double r = key.nextDouble();
        double t = key.nextDouble();

        System.out.println("Amount of interest: " + p * r * t);
        System.out.println("Principle rate: " + i/r*t);
        System.out.println("Interest rate: " + i/p*t);
        System.out.println("Amount of time: " +i/r*p);
    }
}
