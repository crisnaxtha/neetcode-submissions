class StringIterator {
    private String compStr;

    public StringIterator(String compressedString) {
       this.compStr = compressedString; 
    }
    
    public char next() {
       
            String s = this.compStr.substring(0, 2);
            char res = s.charAt(0);
            int count = Integer.parseInt(s.substring(1, 2));
            if(count == 1) {
                this.compStr = this.compStr.substring(2);
            } else if(count > 1) {
                count--;
                this.compStr = this.compStr.substring(0, 1) + count + this.compStr.substring(2);
            }
        
        return res;
    }
    
    public boolean hasNext() {
        return this.compStr.length() >= 2 ? true : false;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
