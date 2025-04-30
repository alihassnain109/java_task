public class Task1{
 public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("before reverse : " + input);
        System.out.println("after Reversed: " + reverseString(input));
    }
}
