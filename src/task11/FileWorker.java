package task11;

import java.io.*;

public class FileWorker {

    public static StringBuilder ReadFile(String pathWay) throws IOException {
        final File file = new File(pathWay);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder inputText = new StringBuilder();
        String string = reader.readLine();
        while (string != null) {
            inputText.append(string);
            string = reader.readLine();
            if (string!=null){
                inputText.append('\n');
            }
        }
        return inputText;
    }

    public static void WriteFile(StringBuilder outputText, String pathWay) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathWay));
        writer.write(String.valueOf(outputText));
        writer.close();
    }
}
