class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, 
    List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) {
            return false;
        }
        Set<List<String>> set = new HashSet<>();

        for(List<String> strList : similarPairs) {
            set.add(strList);
        }
        int l = 0;
        
        while(l < sentence1.length && l < sentence2.length) {
            if(!sentence1[l].equals(sentence2[l]) 
            && !(set.contains(List.of(sentence1[l], sentence2[l]))
                || set.contains(List.of(sentence2[l], sentence1[l]))) ) {
                    return false;
                }
                l++;
        }
        return true;
    }
}
