import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 through 5

        /*
            Syntax of for loops:

            for(initialisation; condition; increment/decrement){
            // body
            }

         */

//        for(int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }

        //Q: Print numbers from 1 to n

        Scanner key = new Scanner(System.in);

//        int n = key.nextInt();
//
//        for(int i = 1; i <= n; i++){
//           System.out.println(i);
//            System.out.println("Hello world");
//        }

        /* while loops
             Syntax:
             while(condition) {
             // body
             }
         */

        int num = 1;

        while(num <= 5){
            System.out.println(num);
            num += 1;
        }

        //do while

        /*
            do{

            // body

            } while (condition)

         */

        int n = 1;

        do{
            System.out.println("Hello world");
            n++;
        }

        while(n != 1);

    }
}
