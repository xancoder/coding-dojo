import java.util.TreeMap;

class CountChar {
    public static void main(String[] args) {
        String inputString = "12345678900000000000-Hello-World";
        countChar(inputString);
    }

    public static void countChar(String tmpString) {
        // use TreeMap which is naturally sorted
        TreeMap<Character, Integer> counts = new TreeMap<>();

        for (char letter : tmpString.toCharArray()) {
            counts.put(letter, counts.getOrDefault(letter, 0) + 1);
        }

        for (char i : counts.keySet()) {
            double percent = counts.get(i).floatValue() / tmpString.length();
            System.out.printf("'%c' %d %.2f\n", i, counts.get(i), percent);
        }
    }
}
