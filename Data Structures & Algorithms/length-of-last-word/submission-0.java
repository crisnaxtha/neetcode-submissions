class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        for(String a : strArr) {
            System.out.println(a);
        }

        String testString = strArr[strArr.length - 1];

        return testString.length();
    }
}