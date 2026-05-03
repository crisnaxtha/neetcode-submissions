class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int res = words.length;
        for(char c : allowed.toCharArray()) {
            set.add(c);
        }

        for(String word : words) {
            for(char ch : word.toCharArray()) {
                if(!set.contains(ch)) {
                    res--;
                    break;
                }
            }
        }

        return res;
    }
}