import java.util.TreeMap;

class CountChar {
    public static void main(String[] args) {
        String stringAsACharSequence = "1234567890000000abcd-ATCG";
        count_char(stringAsACharSequence);
    }

    public static void count_char(String tmpString) {
        // use TreeMap which is naturally sorted
        TreeMap<Character, Integer> counts = new TreeMap<>();

        for (char letter : tmpString.toCharArray()) {
            counts.put(letter, counts.getOrDefault(letter, 0) + 1);
        }

        for (char i : counts.keySet()) {
            System.out.printf("'%c' %d\n", i, counts.get(i));
        }
    }
}
