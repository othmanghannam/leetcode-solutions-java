import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String , List<String>> map = new HashMap<>() ; 
        for ( String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars) ; 
            String cle = new String(chars);
            if (!map.containsKey(cle)) {
                map.put(cle,new ArrayList<>()) ;
            }
            map.get(cle).add(word) ;
        }
    return new ArrayList<>(map.values());
    }
}

