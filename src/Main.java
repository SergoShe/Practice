import java.util.Arrays;

public class Main {
    public static void StringProcessing1(String text) {
        int len = text.length();
        if (len > 5) {
            System.out.println(text.substring(0,3) + text.substring(len-3));
        } else {
            System.out.println(text.substring(0,1).repeat(len));
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Task3.fillZerosAndOnes(10)));
        System.out.println(Arrays.toString(Task3.fillOdds(10)));
        System.out.println(Arrays.toString(Task3.fillRandomZerosAndOnes(40)));
        Task3.fillRandomTwoDimensionalArray(3);

    }
}
