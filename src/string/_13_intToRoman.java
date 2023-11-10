package string;

public class _13_intToRoman {
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        StringBuilder rom = new StringBuilder();
        int ind = 0;

        while (num != 0) {
            int digit = num%10;

            switch (digit) {
                case 0: {
                    ++ind;
                    break;
                }
                case 1: {
                    if (ind == 0) rom.append('I');
                    else if (ind == 1) rom.append('X');
                    else if (ind == 2) rom.append('C');
                    else if (ind == 3) rom.append('M');
                    ++ind;
                    break;
                }
                case 2: {
                    if (ind == 0) rom.append("II");
                    else if (ind == 1) rom.append("XX");
                    else if (ind == 2) rom.append("CC");
                    else if (ind == 3) rom.append("MM");
                    ++ind;
                    break;
                }
                case 3: {
                    if (ind == 0) rom.append("III");
                    else if (ind == 1) rom.append("XXX");
                    else if (ind == 2) rom.append("CCC");
                    else if (ind == 3) rom.append("MMM");
                    ++ind;
                    break;
                }
                case 4: {
                    if (ind == 0) rom.append("VI");
                    else if (ind == 1) rom.append("LX");
                    else if (ind == 2) rom.append("DC");
                    ++ind;
                    break;
                }
                case 5: {
                    if (ind == 0) rom.append("V");
                    else if (ind == 1) rom.append("L");
                    else if (ind == 2) rom.append("D");
                    ++ind;
                    break;
                }
                case 6: {
                    if (ind == 0) rom.append("IV");
                    else if (ind == 1) rom.append("XL");
                    else if (ind == 2) rom.append("CD");
                    ++ind;
                    break;
                }
                case 7: {
                    if (ind == 0) rom.append("IIV");
                    else if (ind == 1) rom.append("XXL");
                    else if (ind == 2) rom.append("CCD");
                    ++ind;
                    break;
                }
                case 8: {
                    if (ind == 0) rom.append("IIIV");
                    else if (ind == 1) rom.append("XXXL");
                    else if (ind == 2) rom.append("CCCD");
                    ++ind;
                    break;
                }
                case 9: {
                    if (ind == 0) rom.append("XI");
                    else if (ind == 1) rom.append("CX");
                    else if (ind == 2) rom.append("MC");
                    ++ind;
                    break;
                }
            }

            num /= 10;
        }
        return rom.reverse().toString();
    }
}
