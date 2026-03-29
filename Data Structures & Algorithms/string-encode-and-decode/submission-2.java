class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> res = new ArrayList<>();
        int len = str.length();
        System.out.println("len=" + len);
        
        for(int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            while(Character.isDigit(str.charAt(i)) && str.charAt(i) != '#') {
                sb.append(str.charAt(i));
                i++;
            }
            String st = new String(sb);
            System.out.println("size=" + st);
            System.out.println("i=" + i);
            Integer l = Integer.parseInt(st);
            if(Character.isDigit(str.charAt(i - 1)) && str.charAt(i) == '#') {
                if(l == 0) {
                    res.add("");
                } else {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    while(l > 0) {
                        // System.out.println(i);
                        sb2.append(str.charAt(i));
                        l--;
                        if(l != 0) {
                            i++;
                        }
                    }
                    String resultStr = new String(sb2);
                    System.out.println(resultStr);
                    res.add(resultStr);
                }
            }
        }
        return res;
    }
}
