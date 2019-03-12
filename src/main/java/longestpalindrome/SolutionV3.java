package longestpalindrome;

/**
 * @author: chenhuang
 * @date: 2019/3/9
 * @description:
 */
public class SolutionV3 {
    public static void main(String[] args) {
        SolutionV3 solution = new SolutionV3();
        System.out.println(solution.longestPalindrome("vv"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start, end;
        start = 0;
        end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = longHelp(s, i, i);
            if (len1 > end - start) {
                start = i - (len1 - 1) / 2;
                end = i + len1 / 2;
            }
            if (s.length() >= 2 && findTwins(s, i)) {
                int len2 = longHelp(s, i, i + 1);
                if (len2 > end - start) {
                    start = i - (len2 - 1) / 2;
                    end = i + len2 / 2;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    private int longHelp(String s, int x, int y) {
        while (x >= 0 && y < s.length() && s.charAt(x) == s.charAt(y)) {
            x--;
            y++;
        }
        return y - x - 1;
    }

    private boolean findTwins(String s, int index) {
        for (int i = index; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
