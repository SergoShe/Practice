public class Task2 {
    public static int summa (int number) {
        int result = 0;
        number = Math.abs(number);
        while (number>0) {
            int rem = number%10;
            if (rem%2 == 0) {
                result += rem;
            }
            number /= 10;
        }
        return result;
    }
    public static void evenAndOdd (int number) {
        int odd = 0;
        int even = number==0 ? 1 : 0;
        number = Math.abs(number);
        while (number>0) {
            int rem = number%10;
            if (rem%2==0) {
                even+=1;
            } else {
                odd+=1;
            }
            number /= 10;
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
    public static int reverseNum (int number) {
        int result = 0;
        while (number != 0) {
            int rem = number%10;
            result = result*10 + rem;
            number /= 10;
        }
        return result;
    }
}
