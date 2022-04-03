package 哈希表;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 有效的字母异位词242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c))
                return false;
            else {
                map.put(c, map.get(c) - 1);
            }
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        s = "raaaaaat";
        t = "aaaaaatr";
        System.out.println(isAnagram(s, t));
    }
}
