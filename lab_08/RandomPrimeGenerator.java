import java.util.Random;

public class RandomPrimeGenerator {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int generateRandomPrime(int min, int max) {
        Random rand = new Random();
        int prime;
        do {
            prime = rand.nextInt(max - min + 1) + min;
        } while (!isPrime(prime));
        return prime;
    }

    public static void main(String[] args) {
        int min = 10, max = 20;
        System.out.println("Random Prime: " + generateRandomPrime(min, max));
    }
}
