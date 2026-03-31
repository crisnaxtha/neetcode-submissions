class Solution {
    public boolean confusingNumber(int n) {
        int c = n;
        String s = "";
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);
        while(c >= 1) {
            int rem = c % 10;
            c = c / 10;
            if(rem == 2 || rem == 3 || rem == 4 || rem == 5 || rem == 7) {
                return false;
            }
            s = s + map.get(rem);
            System.out.println(s);
        }
        if(s != "" && n == Integer.parseInt(s)) {
            return false;
        }
        return true;
    }
}
