public class CustomHashMap {

    /*
     * The Entry class is an inner class used in CustomHashMap. This class holds
     * the Key and Value used in HashMap.
     *
     */
    public static class Entry<k, v> {
        String key;
        String value;

        // CONSTRUCTOR with parameter for Entry class. This contructor will be
        // used to create Entry object with key and value.
        public Entry(final String key, final String value) {
            this.key = key;
            this.value = value;
        }
    }

    public Entry[] myMap;// This array actually holds the entries of the map.
    public int length; // Length of the array created initially
    public int count; // The count of entries in the map.

    public CustomHashMap(final int length) {
        this.length = length;
        this.myMap = new Entry[length];
        this.count = -1;
    }

    public static void myassert(final boolean x) {
        // CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail");
        }
    }

    /*
     * Write this method to return the value for the key entered. If the key
     * doesnt match any keys inside the map then null should be returned.
     */
    public String get(final String key) {

    }

    /*
     * Write this method to remove from the map for the key entered. If the key
     * doesnt match any keys then do not remove anything,
     */
    public void remove(final String key) {

    }

    // Write this method to add entries to the map.
    public void put(final String key, final String value) {

    }

    // check whether if the hashmap is full for not.
    public boolean isFull() {
    }
    
    // This method will be used in both put and get methods.
    // Given a key, this method will return the position/bucket index of the array
    private int hash(String key) {
		return Math.abs(key.hashCode()) % size;
    }

    
    public static void main(final String[] args) {

        CustomHashMap myMap = new CustomHashMap(5);
        myMap.put("Apple", "Cupertino");
        myMap.put("Google", "Moutain View");
        myMap.put("Facebook", "Menlo Park");
        myMap.put("Twitter", "San Francisco");
        myMap.put("Amazon", "Seattle");
        myassert(myMap.get("Apple").equalsIngoreCase("Cupertino"));
        myassert(myMap.get("Twitter").equalsIngoreCase("San Francisco"));
        myassert(myMap.get("Facebook").equalsIngoreCase("Menlo Park"));
        myMap.put("Amazon", "Sunnyvale");
        myMap.remove("Twitter");
        myassert(myMap.get("Amazon").equalsIngoreCase("Sunnyvale"));
        myMap.put("Paypal", "San Jose");
        myassert(myMap.get("Paypal").equalsIngoreCase("San Jose"));
        myMap.put("Slack", "San Francisco");
        myMap.put("Oracle", "Foster City");
        myassert(myMap.get("Slack").equalsIngoreCase("San Francisco"));

    }
}
