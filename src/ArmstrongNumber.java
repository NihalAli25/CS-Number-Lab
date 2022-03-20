import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       int n = key.nextInt();
        isArmstrong(n);
        if(isArmstrong(n) == true){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return sum == original;

    }
}
/* original = 10, sum = 0. rem = 0,
original = 153, sum = 0; rem = 3, sum = 27 ->
original = 15, sum = 27, rem = 5, sum = 152 ->
original = 1, sum = 152, rem = 1, sum = 153 -> true

 */