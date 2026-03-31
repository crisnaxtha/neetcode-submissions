class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        Arrays.sort(words);
        for(int i = 0; i < words.length; i++) {
          for(int j = i; j < words.length; j++) {
            if(!words[j].equals(words[i]) && words[j].contains(words[i])) {
                res.add(words[i]);
            }
          }
        }
        return new ArrayList<>(res);
    }
}