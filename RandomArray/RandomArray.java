import java.util.Random;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random rand = new Random();
        int bound = 100;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(bound);
        }
        System.out.println(Arrays.toString(randomNumbers));

        int temp;
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 1; j < (randomNumbers.length - i); j++) {
                if (randomNumbers[j-1] > randomNumbers[j]) {
                    temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j-1];
                    randomNumbers[j-1] = temp;
                }  
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
    }
}
