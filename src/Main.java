import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void StringProcessing1(String text) {
        int len = text.length();
        if (len > 5) {
            System.out.println(text.substring(0, 3) + text.substring(len - 3));
        } else {
            System.out.println(text.substring(0, 1).repeat(len));
        }
    }

    public static void GuessNumber(int n, int k) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int RandNum = random.nextInt(n);
        int countAttempt = 0;
        boolean isGuessed = false;
        while (countAttempt < k) {
            System.out.print("Enter number: ");
            int num = Integer.parseInt(reader.readLine());
            if (RandNum == num) {
                System.out.println("You guessed!");
                isGuessed = true;
                break;
            } else if (RandNum > num) {
                System.out.print("More. ");
                countAttempt++;
            } else {
                System.out.print("Less. ");
                countAttempt++;
            }
        }
        if (!isGuessed)
            System.out.println("The attempts are over");
    }

    public static void main(String[] args) throws IOException {
        /*//task1
        StringProcessing1("kavabanga");
        //task2
        System.out.println("\n" + Task2.summa(7634574) + "\n");
        Task2.evenAndOdd(7654374);
        System.out.println("\n" + Task2.reverseNum(7654374) + "\n");
        //task3
        System.out.println(Arrays.toString(Task3.fillZerosAndOnes(10)) + "\n");
        System.out.println(Arrays.toString(Task3.fillOdds(10)) + "\n");
        System.out.println(Arrays.toString(Task3.fillRandomZerosAndOnes(40)) + "\n");
        Task3.fillRandomTwoDimensionalArray(3);
        */
        //task4
        GuessNumber(10,3);


    }
}
