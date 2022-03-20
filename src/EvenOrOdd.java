import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int num = key.nextInt();


        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }
}
