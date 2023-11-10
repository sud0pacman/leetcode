package hash_table;

import java.util.HashMap;
import java.util.Map;

public class _2085_countWords {
    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};

        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : words1)
            map.put(s, map.getOrDefault(s, 0) + 1);

        int count = 0;
        for (String s : words2) {
            Integer freq = map.get(s);
            System.out.println(freq);

            // agar so'z words1 topilsa va 1 ga teng yoki kichik marotaba qatnashgan bo'lsa
            if (freq != null && freq <= 1) {
                if (freq == 1)
                    count++; // agar bir marta qatnashgan bo'lsa shartga muvofiq olinadi
                else if (freq == 0) {
                    // agar bu so'zimiz words1 da 1 barta words2 da 1 dan ortiq
                    // qatnashgan bo'lsa bu so'zi chiqarib tashlaymiz
                    count--;
                }

                // qatnashgan so'zi olamiz va uni mapda qatnashish sonini kamaytiramiz
                // shunday qilib words2 dagi bir so'zning ikmarta takrorlangan yoki
                // yo'qligini tekshiramiz chunki biz freq ni kamaytirganimizda va yana
                // aylanib kelib shu so'zni topganimizda freq 0 bo'lsa bu so'z words1 da 1 marta qatnashgan
                // lekin words2 da1 dan ortiq qatnashgan bo'lib qoladi
                map.put(s, freq - 1);
            }
        }

        return count;
    }
}