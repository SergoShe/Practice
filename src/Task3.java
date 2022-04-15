import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static int[] Array1 (int num) {
        int[] Array1 = new int[num];
        for (int i = 0;i<(num/2);i++) {
            Array1[i*2+1]=1;
        }
        return Array1;
    }
    public static int[] Array2 (int num) {
        int[] Array2 = new int[num];
        for (int i = 0;i<num;i++) {
            Array2[i]=1+2*i;
        }
        return Array2;
    }
    public static int[] Array3 (int num) {
        int[] Array3 = new int[num];
        Random random = new Random();
        int zero = random.nextInt(num/4+1);
        int[] randPos = Task3.randIndex(num,zero);
        for (int i=0; i<num;i++) {
            if (Arrays.binarySearch(randPos, i)<=-1)
                Array3[i]=1;
        }
        return Array3;
    }
    private static int[] randIndex(int max, int num) {
        int[] randIndex = new int[num];
        Arrays.fill(randIndex,-1);
        Random random = new Random();
        for (int i=0; i<num; i++) {
            while (true) {
                int randNum = random.nextInt(max);
                int sub = Arrays.binarySearch(randIndex, randNum);
                if (sub<=-1) {
                    randIndex[0] = randNum;
                    break;
                }
            }
            Arrays.sort(randIndex);
        }
        return randIndex;
    }
    public static void Array4 (int num) {
        int[][] Array4 = new int[num][num];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i<num;i++){
            for (int j = 0; j<num;j++) {
                Array4[i][j] = random.nextInt();
                sum += Array4[i][j];
            }
        }
        System.out.println(Arrays.deepToString(Array4));
        System.out.println("Sum = " + sum);
    }
}
