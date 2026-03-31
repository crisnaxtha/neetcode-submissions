class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, 
    List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) {
            return false;
        }
        for(int i = 0; i < sentence1.length; i++) {
            if(sentence1[i].equals(sentence2[i])) {
                continue;
            }
            if(!similarPairs.isEmpty() && !similarPairs.get(i).isEmpty() && (!similarPairs.get(i).contains(sentence1[i])
            || !similarPairs.get(i).contains(sentence2[i]))) {
                return false;
            }
        }

        return true;
    }
}
