class WordDictionary {
    class TrieNode {
        boolean word; 
        Map<Character, TrieNode> children = new HashMap<>();
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = this.root;
        for(char c : word.toCharArray()) {
            if(!curr.children.containsKey(c)) {
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.word = true;
    }

    public boolean search(String word) {
        return dfs(0, word, this.root);
    }

    public boolean dfs(int j, String word, TrieNode root) {
        TrieNode curr = root;
        for(int i = j; i < word.length(); i++) {
            if(word.charAt(i) == '.') {
                for(TrieNode child : curr.children.values()) {
                    if(dfs(i + 1, word, child)) {
                        return true;
                    }
                    return false;
                }
            } else {
                if(!curr.children.containsKey(word.charAt(i))) {
                    return false;
                }
                curr = curr.children.get(word.charAt(i));
            }
        }
        return curr.word;
    }
}
