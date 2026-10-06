class Solution {
    public boolean isPalindrome(String s) {
        String formatted = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int left = 0;
        int right = formatted.length() - 1;

        while (left < right) {
            if (formatted.charAt(left) != formatted.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
