import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int num = key.nextInt();

        for(int i = 1; i <= 11; i++){
            System.out.println(num * i);
        }




    }
}
