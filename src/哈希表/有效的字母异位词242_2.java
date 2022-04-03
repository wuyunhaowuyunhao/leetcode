package 哈希表;

public class 有效的字母异位词242_2 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            counts[c - 'a']--;
        }
        
        for (int i:counts){
            if(i!=0)
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
