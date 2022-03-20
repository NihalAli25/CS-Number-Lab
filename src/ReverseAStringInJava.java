import java.util.Scanner;

public class ReverseAStringInJava {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String word = key.nextLine();

        for (int i = 0; i > word.length(); i--){
            System.out.println(word);
        }
    }
}
