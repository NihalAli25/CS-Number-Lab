import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();

        // Q: Find the largest of the 3 numbers

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }

}
