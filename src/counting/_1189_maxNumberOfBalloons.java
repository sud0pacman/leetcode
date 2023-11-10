package counting;

public class _1189_maxNumberOfBalloons {
    public static void main(String[] args) {
        String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];

        for (char ch : text.toCharArray()) {
            charCount[ch - 'a']++;
        }
        int balloons = 0;

        while (charCount[1] >= 1 && charCount[0] >= 1 && charCount[11] >= 2 && charCount[14] >= 2 && charCount[13] >= 1) {

            charCount[1]--;
            charCount[0]--;
            charCount[11] -= 2;
            charCount[14] -= 2;
            charCount[13]--;
            balloons++;
        }

        return balloons;
    }
}
