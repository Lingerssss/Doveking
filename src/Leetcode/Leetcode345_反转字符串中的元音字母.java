package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode345_反转字符串中的元音字母 {
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if (s.equals(null)) {
            return null;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] res = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (vowels.contains(ci) == false) {
                res[i] = ci;
                i++;
            } else if (vowels.contains(cj) == false) {
                res[j] = cj;
                j--;

            } else {
                res[i] = cj;
                res[j] = ci;
            }
        }
        return (new String(res));


    }
}
