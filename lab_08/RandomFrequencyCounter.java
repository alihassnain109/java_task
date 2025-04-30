import java.util.Random;

public class RandomFrequencyCounter {
    public static void main(String[] args) {
        int[] frequency = new int[21];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(21);
            frequency[number]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Number " + i + ": " + frequency[i] + " times");
        }
    }
}
