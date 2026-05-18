class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int ns = s.length();
        int nt = t.length();

        if (Math.abs(ns - nt) > 1 || s.equals(t)) {
            return false;
        }

        for (int i = 0; i < Math.min(ns, nt); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (ns == nt) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else if (ns < nt) {
                    return s.substring(i).equals(t.substring(i + 1));
                } else {
                    return s.substring(i + 1).equals(t.substring(i));
                }
            }
        }

        return Math.abs(ns - nt) == 1;
    }
}