class StringIterator {
    private String compStr;

    public StringIterator(String compressedString) {
       this.compStr = compressedString; 
    }
    
    public char next() {
        char res = this.compStr.charAt(0);
        int l = 1;
        while(l < this.compStr.length() && Character.isDigit(this.compStr.charAt(l))) {
            l++;
        }
        int count = Integer.parseInt(this.compStr.substring(1, l));
        if(count == 1) {
            this.compStr = this.compStr.substring(l);
        } else {
            count--;
            this.compStr = this.compStr.substring(0, 1) + count + this.compStr.substring(l);
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
