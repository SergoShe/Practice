import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static int[] fillZerosAndOnes (int num) {
        int[] array = new int[num];
        for (int i = 0;i<num;i++) {
            if (i%2==1)
                array[i]=1;
        }
        return array;
    }
    public static int[] fillOdds (int num) {
        int[] array = new int[num];
        for (int i = 0;i<num;i++) {
            array[i]=1+2*i;
        }
        return array;
    }
    public static int[] fillRandomZerosAndOnes (int num) {
        int[] array = new int[num];
        Random random = new Random();
        Arrays.fill(array,1);
        int numberOfZeros = random.nextInt(num/4+1);
        int countZero = 0;
        while ( countZero < numberOfZeros) {
            int randNum = random.nextInt(num);
            if (array[randNum] == 1) {
                array[randNum]=0;
                countZero++;
            }
        }
        return array;
    }
    public static void fillRandomTwoDimensionalArray (int num) {
        int[][] array = new int[num][num];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i<num;i++){
            for (int j = 0; j<num;j++) {
                array[i][j] = random.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum = " + sum);
    }
}