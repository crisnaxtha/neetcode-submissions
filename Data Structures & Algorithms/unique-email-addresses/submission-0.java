class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String, Integer> map = new HashMap<>();

        for(String email : emails) {
            int l = -1, r = 0;
            String sb = "";
            while(r < email.length()) {
                if(email.charAt(r) == '.') {
                    r++;
                    continue;
                } else if(email.charAt(r) == '+') {
                    while(r < email.length() && email.charAt(r) != '@') {
                        r++;
                    }
                } 
                if(email.charAt(r) == '@') {
                    sb = sb + email.substring(r);
                    map.put(sb, map.getOrDefault(sb, 0) + 1);
                }
                sb = sb + email.charAt(r);
                r++;
            }
        }
        return map.size();
    }
}