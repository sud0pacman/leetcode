package leetcode_problems;

public class _1108_DefangIPaddr {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder ipAddress =  new StringBuilder();
        int i = 0;

        do {
            if (address.charAt(i) == '.') ipAddress.append("[.]");
            else ipAddress.append(address.charAt(i));

            ++i;
        } while (i < address.length());

        return ipAddress.toString();
    }
}
