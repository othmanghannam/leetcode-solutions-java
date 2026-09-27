class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ){
            return false ; 
        } 
        char [] verification = new char []{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'} ; 
        int [] compteur = new int[26] ;
        for (char c : s.toCharArray()) {
            for (int i = 0; i < verification.length; i++) {
                if (c == verification[i]){
                    compteur[i]++ ; 
                }
            }
        }
        
        for (char d : t.toCharArray()) {
            for (int j = 0; j < verification.length; j++) {
                if (d == verification[j]){
                    compteur[j]-- ; 
                }
            }
        }

        for (int k = 0; k < verification.length; k++) {
                if (compteur[k]!= 0 ){
                    return false ; 
                }
        }
        return true ; 
            
    }
} 
