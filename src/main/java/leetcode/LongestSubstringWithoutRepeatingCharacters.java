package leetcode;


import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: chenhuang
 * @date: 2019/3/12
 * @description:
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left, right, max;
        HashSet<Character> characterHashSet = new HashSet<>(16);
        left = right = 0;
        max = 1;
        while (left <= right && right < s.length()) {
            if (characterHashSet.add(s.charAt(right))) {
                max = max < (right - left + 1) ? right - left + 1 : max;
                right++;
            } else {
                for (int i = left; i < s.indexOf(s.charAt(right), left) + 1; i++) {
                    characterHashSet.remove(s.charAt(i));
                }
                left = s.indexOf(s.charAt(right), left) + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();
        characters.lengthOfLongestSubstring(" ");
    }
}
