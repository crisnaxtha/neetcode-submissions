class Solution {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int prevIndex = 0;
        int tempTime = 0;
        for(int i = 0; i < word.length(); i++) {
            int tempIndex = keyboard.indexOf(word.charAt(i));
            tempTime = (tempIndex - prevIndex) > 0 ? (tempIndex - prevIndex) : (tempIndex - prevIndex) * -1;
            time = tempTime + time;
            prevIndex = tempIndex;
        }
        return time;
    }
}
