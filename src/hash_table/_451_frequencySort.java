package hash_table;

public class _451_frequencySort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        char[] arr = new char[123];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }
}
