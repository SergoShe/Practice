import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void stringProcessing1(String text) {
        int len = text.length();
        if (len > 5) {
            System.out.println(text.substring(0, 3) + text.substring(len - 3));
        } else {
            System.out.println(text.substring(0, 1).repeat(len));
        }
    }

    public static void guessNumber(int n, int k) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int randNum = random.nextInt(n) + 1;
        int countAttempt = 0;
        boolean isGuessed = false;
        while (countAttempt < k && !isGuessed) {
            System.out.print("Enter number: ");
            int num = Integer.parseInt(reader.readLine());
            if (randNum == num) {
                System.out.println("You guessed!");
                isGuessed = true;
            } else if (randNum > num) {
                System.out.print("More. ");
            } else {
                System.out.print("Less. ");
            }
            countAttempt++;
        }
        if (!isGuessed)
            System.out.println("The attempts are over");
    }

    public static void calculateFunction() {
        System.out.println("\tx\t\t y");
        for (double x = -5; x <= 5; x += 0.5) {
            double y = 5 - x * x / 2;
            System.out.println("   " + x + "\t\t" + y);
        }
    }

    public static void workWithFile() {
        File file = new File("input1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output1.txt"))) {
                String text;
                while ((text = reader.readLine()) != null) {
                    String upperLetter = text.substring(0, 1).toUpperCase();
                    String toUpperLine = upperLetter + text.substring(1) + "\n";
                    writer.write(toUpperLine);
                }
                reader.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        //task4
        guessNumber(10, 3);
        //Task5
        calculateFunction();
        */
        //Task6
        Task7.workWithFile();

    }
}
