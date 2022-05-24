import java.util.ArrayList;
import java.util.Random;

public class Task9 {
    public static String generatePassword(int length, boolean needLowerChar, boolean needUpperChar, boolean needNumber, boolean needSymbol) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Error: length less than or equal to zero");
        }
        if (!(needLowerChar || needUpperChar || needNumber || needSymbol)) {
            throw new IllegalArgumentException("Error: option(s) not selected");
        }

        Random rand = new Random();
        String password = "";
        ArrayList<String> option = setOption(needLowerChar, needUpperChar, needNumber, needSymbol);
        for (int i = 0; i < length; i++) {
            int numberOfType = rand.nextInt(option.size());
            String text = option.get(numberOfType);
            char Char = text.charAt(rand.nextInt(text.length()));
            password += Char;
        }
        return password;
    }

    private static ArrayList<String> setOption(boolean needLowerChar, boolean needUpperChar, boolean needNumber, boolean needSymbol) {
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String symblos = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        ArrayList<String> options = new ArrayList<>();
        if (needLowerChar)
            options.add(lowerChars);
        if (needUpperChar)
            options.add(upperChars);
        if (needNumber)
            options.add(numbers);
        if (needSymbol)
            options.add(symblos);
        return options;
    }
}
