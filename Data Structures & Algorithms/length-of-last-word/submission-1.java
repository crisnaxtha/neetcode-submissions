class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        String testString = strArr[strArr.length - 1];
        return testString.length();
    }
}