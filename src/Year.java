import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int year = key.nextInt();

        if(year % 4 == 0){
            System.out.println("Leap year");

        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
