class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int length = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch)) return false;
            
            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) map.remove(ch);
        }

        return map.isEmpty();
    }
}