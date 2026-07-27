class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store frequency of each letter (a-z)
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts returned to zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
