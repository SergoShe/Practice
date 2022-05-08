import java.io.*;

public class Task7 {

    static BufferedReader reader;
    static BufferedWriter writer;

    public static void init(){

        try {
            reader = new BufferedReader(new FileReader("input1.txt"));
            writer = new BufferedWriter(new FileWriter("output1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close(){
        try{
            reader.close();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void workWithFile() throws IOException {
        init();
        String text;
        while ((text = reader.readLine()) != null) {
            String upperLetter = text.substring(0, 1).toUpperCase();
            String toUpperLine = upperLetter + text.substring(1) + "\n";
            writer.write(toUpperLine);
        }
        close();
    }
}
