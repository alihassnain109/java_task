public class VowelConsonantCounter {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) >= 0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
public class Task04{
    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}
