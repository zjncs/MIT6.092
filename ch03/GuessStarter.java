import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in=new Scanner(System.in);
        int userGuess= in.nextInt();
        int difference =Math.abs(userGuess-number);
        System.out.println("偏差："+difference);


        System.out.println(number);
    }

}
