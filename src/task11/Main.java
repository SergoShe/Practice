package task11;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathWay = String.valueOf(Path.of("src\\task11\\input_test.txt").toAbsolutePath());
        StringBuilder text = FileWorker.ReadFile(pathWay);

        long start = System.nanoTime();
        StringBuilder outputText1 = permutationWords1(text);
        long finish = System.nanoTime();
        double time1 = (double) (finish - start) / 1000000;
        System.out.println("First method, time: " + (time1) + " ms");
        FileWorker.WriteFile(outputText1, "src\\task11\\output1.txt");

        start = System.nanoTime();
        StringBuilder outputText2 = permutationWords2(text);
        finish = System.nanoTime();
        double time2 = (double) (finish - start) / 1000000;
        System.out.println("Second method, time: " + (time2) + " ms");
        FileWorker.WriteFile(outputText2, "src\\task11\\output2.txt");
        double difference = (time1 > time2) ? (time1 / time2) : (time2 / time1);
        System.out.println("\nDifference: " + String.format("%.3f", difference));
    }

    public static StringBuilder permutationWords1(StringBuilder text) {
        StringBuilder permutationText = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == ' ' || letter == '\n') {
                permutationText.insert(0, temp).insert(0, letter);
                temp.delete(0, temp.length());
            } else {
                temp.append(text.charAt(i));
            }
        }
        if (!temp.isEmpty()) {
            permutationText.insert(0, temp);
        }
        return permutationText;
    }

    public static StringBuilder permutationWords2(StringBuilder text) {
        StringBuilder permutationText = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            char letter = text.charAt(i);
            if (letter == ' ' || letter == '\n') {
                temp.reverse();
                permutationText.append(temp).append(letter);
                temp.delete(0, temp.length());
            } else {
                temp.append(text.charAt(i));
            }
        }
        if (!temp.isEmpty()) {
            temp.reverse();
            permutationText.append(temp);
        }
        return permutationText;
    }
}
