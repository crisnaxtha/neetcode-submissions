class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strings) {
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 1; i < str.length(); i++) {
                int diff = (str.charAt(i) - str.charAt(i - 1) + 26) % 26;
                keyBuilder.append(diff).append(",");
            }
            String key = keyBuilder.toString();
            if(map.containsKey(key)) {
                List<String> tempList = map.get(key);
                tempList.add(str);
                map.put(key, tempList);

            } else {
                List<String> newTempList = map.getOrDefault(key, new ArrayList<>());
                newTempList.add(str);
                map.put(key, newTempList);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }  
}