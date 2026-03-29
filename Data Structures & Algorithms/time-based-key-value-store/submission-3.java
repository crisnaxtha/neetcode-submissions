class TimeMap {

    public TimeMap() {
        
    }

    Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    
    public void set(String key, String value, int timestamp) {
        System.out.println("key " + key + " value" + value + " timestamp" + timestamp);
        map.computeIfAbsent(key, k -> new TreeMap<>())
        .put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
       TreeMap<Integer, String> tm = map.get(key);
        if (tm == null) return "";

        Map.Entry<Integer, String> entry = tm.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}
