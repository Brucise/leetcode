package longestpalindrome;


/**
 * @author: chenhuang
 * @date: 2019/3/8
 * @description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindromeV2("aaaa"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }

    public String longestPalindromeV2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int p, q;
        StringBuilder stringBuilder = new StringBuilder(s);
        CharSequence longsub = new StringBuilder(s.substring(0, 1));
        for (int i = 0; i < stringBuilder.length(); i++) {
            p = q = i;
            CharSequence s1 = longHelp(stringBuilder, p, q);
            if (s1.length() > longsub.length()) {
                longsub = s1;
            }
            if (s.length() >= 2 && findTwins(s, i)) {
                p = i;
                q = i + 1;
                CharSequence s2 = longHelp(stringBuilder, p, q);
                if (s2.length() > longsub.length()) {
                    longsub = s2;
                }
            }
        }
        return longsub.toString();
    }

    private CharSequence longHelp(StringBuilder s, int x, int y) {
        int maxsub, left, right;
        maxsub = 1;
        CharSequence charSequence = s.subSequence(0, 1);
        while (x >= 0 && y < s.length() && s.charAt(x) == s.charAt(y)) {
            int cur = y - x + 1;
            left = x;
            right = y;
            x--;
            y++;
            if (cur > maxsub) {
                maxsub = cur;
                charSequence = s.subSequence(left, right + 1);
            }
        }
        return charSequence;
    }

    private boolean findTwins(String s, int index) {
        for (int i = index; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] arr = s.toCharArray();
        char[] arrInterval = new char[s.length() * 2 + 1];
        for (int i = 0; i < arrInterval.length; i++) {
            arrInterval[i] = ' ';
        }
        for (int i = 0; i < s.length(); i++) {
            arrInterval[2 * i + 1] = arr[i];
        }
        return longestPalindromeHelp(arrInterval);
    }

    private String longestPalindromeHelp(char[] arr) {
        String longgest = String.valueOf(arr[1]);
        for (int i = 2; i < arr.length; i++) {
            char[] result = new char[arr.length];
            int p, q;
            p = i - (1 + i % 2);
            q = i + (1 + i % 2);
            while (p > 0 && q < arr.length) {
                if (arr[p] != arr[q]) {
                    break;
                }
                result[i] = arr[i];
                result[p] = result[q] = arr[p];
                p = p - 2;
                q = q + 2;
            }
            String current = String.valueOf(result).trim().replaceAll("[^0-9a-zA-Z]", "");
            if (longgest.length() <= current.length()) {
                longgest = current;
            }
        }
        return longgest;
    }
}
