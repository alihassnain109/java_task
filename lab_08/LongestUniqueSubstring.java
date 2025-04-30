import java.util.*;

public class LongestUniqueSubstring {

    public static int longestUniqueSubstring(String str) {
        Set<Character> seen = new HashSet<>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < str.length(); right++) {
            while (seen.contains(str.charAt(right))) {
                seen.remove(str.charAt(left++));
            }
            seen.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of longest unique substring: " + longestUniqueSubstring(input));
    }
}
