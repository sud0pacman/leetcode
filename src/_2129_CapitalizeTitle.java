package leetcode_problems;

public class _2129_CapitalizeTitle {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("i First Letter OF EAch Word"));
    }

    public static String capitalizeTitle(String title) {
        String[] splitTitle = title.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < splitTitle.length) {
            splitTitle[i] = splitTitle[i].toLowerCase();

            if (splitTitle[i].length() > 2) {
                splitTitle[i] = splitTitle[i].substring(0, 1).toUpperCase() + splitTitle[i].substring(1);
            }

            result.append(splitTitle[i]).append(" ");

            ++i;
        }

//        for (i = 0; i < splitTitle.length; i++) {
//            splitTitle[i] = splitTitle[i].toLowerCase();
//
//            if (splitTitle[i].length() > 2) {
//                splitTitle[i] = splitTitle[i].substring(0, 1).toUpperCase() + splitTitle[i].substring(1);
//            }
//
//            result.append(splitTitle[i]).append(" ");
//        }


        return result.toString().trim();
    }
}
