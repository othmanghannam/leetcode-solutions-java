class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] compteur = new int[26];

        for (int i = 0; i < s.length(); i++) {
            compteur[s.charAt(i) - 'a']++;
            compteur[t.charAt(i) - 'a']--;
        }

        for (int count : compteur) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}