package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class 赎金信383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:magazine.toCharArray()){
            if (map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for (char c:ransomNote.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)==0)
                    return false;
                map.put(c,map.get(c)-1);
            }else
                return false;
        }
        return true;
    }
}
