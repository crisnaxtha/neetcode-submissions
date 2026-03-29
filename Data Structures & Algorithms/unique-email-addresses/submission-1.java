class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

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
                    set.add(sb);
                }
                sb = sb + email.charAt(r);
                r++;
            }
        }
        return set.size();
    }
}