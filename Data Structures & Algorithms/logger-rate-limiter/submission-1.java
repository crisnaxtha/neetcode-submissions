class Logger {
    Map<String, Integer> map;

    public Logger() {
        this.map = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean res = false;
        
        if(map.containsKey(message)) {
            res = map.get(message) + 10 <= timestamp;
            if(res) {
                map.put(message, timestamp);
            }
        } else {
            map.put(message, timestamp);
            res = true;
        }
        
        return res;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
