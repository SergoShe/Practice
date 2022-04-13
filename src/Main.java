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
        Main.StringProcessing1("kavabanga");
        Task2.evenAndOdd(43560);
        System.out.println(Task2.summa(-497527564));
        System.out.println(Task2.reverseNum(890877420));
    }
}
