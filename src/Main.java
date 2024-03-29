import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

    public static boolean checkString(String text) {
        int length = text.length();
        boolean[] buffer = new boolean[128];
        for (int i = 0; i < length; i++) {
            int letter = text.charAt(i);
            if (buffer[letter])
                return false;
            buffer[letter] = true;
        }
        return true;
    }

    public static void salaryAnalysis() {
        String[] names = {"Cornelia Jakobs", "Sam Ryder", "Amanda Tenfjord", "Sheldon Riley", "Rosa Linn",
                "Malik Harris", "Emma Muscat", "Marius Bear", "Monika Liu", "Nadir Rustamli"};
        Random rand = new Random();
        HashMap<String, Integer> nameToSalary = new HashMap<>();
        int summa = 0;
        for (String name : names) {
            int salary = (rand.nextInt(76) + 25) * 1000;
            summa += salary;
            nameToSalary.put(name, salary);
        }
        int average = summa / nameToSalary.size();

        String highest = names[0], lowest = names[0];
        for (String name : names) {
            if (nameToSalary.get(name) > nameToSalary.get(highest))
                highest = name;
            if (nameToSalary.get(name) < nameToSalary.get(lowest))
                lowest = name;
        }
        System.out.println("The Highest: " + highest);
        System.out.println("The Lowest: " + lowest);
        System.out.print("\nAbove average: ");

        for (String name : names) {
            if (nameToSalary.get(name) > average)
                System.out.print(name + "; ");
        }
        System.out.println("\n");
        for (String name : names) {
            int salary = nameToSalary.get(name);
            double tax = salary*0.13;
            System.out.println(name + " - " + (salary - tax) + " - " + tax);
        }
    }

    public static void main(String[] args) throws Exception {
        /*
        // ** PART 1 **
        //task1
        stringProcessing1("kavabanga");
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
        //Task6
        System.out.println(checkString("av"));
        //Task7
        Task7.workWithFile();
        //Task8
        salaryAnalysis();
        //Task9
        String password = Task9.generatePassword(10,true,true,true, true);
        System.out.println(password);
        */
        // ** PART 2 **

        //MyQueue
        MyQueue queue = new MyQueue("Brat");
        System.out.println(queue.add("Hello"));
        queue.add(null);
        System.out.println(queue.offer("Fedos"));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.add("Steven");
        queue.add("Egor");
        System.out.println(queue.poll());
        queue.poll();
        System.out.println(queue.remove());
        System.out.println(queue.element());
    }
}
