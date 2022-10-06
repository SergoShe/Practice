package task11;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathWay = String.valueOf(Path.of("src\\task11\\input.txt").toAbsolutePath());
        StringBuilder text = FileWorker.ReadFile(pathWay);
        StringBuilder outputText = permutationWords(text);
        FileWorker.WriteFile(outputText, "src\\task11\\output.txt");
    }

    public static StringBuilder permutationWords(StringBuilder text) {
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
}
