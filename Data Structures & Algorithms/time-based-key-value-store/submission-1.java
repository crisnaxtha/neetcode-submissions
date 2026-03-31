class TimeMap {

    public TimeMap() {
        
    }

    Map<String, Map<String, Integer>> map = new HashMap<>();

    
    public void set(String key, String value, int timestamp) {
        Map<String, Integer> m = new HashMap<>();
        m.put(value, timestamp);
        map.put(key, m);
    }
    
    public String get(String key, int timestamp) {
        Map<String, Integer> m = map.get(key);
        String res = "";
        if(m.size() > 0) {
            for(Map.Entry<String, Integer> entry : m.entrySet()) {
                if(entry.getValue() <= timestamp) {
                    res = entry.getKey();
                }
            }
        }

        return res;
    }
}
