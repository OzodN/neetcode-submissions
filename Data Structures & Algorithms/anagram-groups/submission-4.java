class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = String.valueOf(chars);

            groups.putIfAbsent(sortedKey, new ArrayList<>());

            groups.get(sortedKey).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
