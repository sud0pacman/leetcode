package manipulation;

public class _476_findComplement {
    public static void main(String[] args) {
        int number= 20;
        switch (number) {
            case 10: System.out.println(10);
            case 20:
                System.out.println(20);
            case 30:
                System.out.println(30);
            case 15:
                System.out.println(15);
            default:
                System.out.println("Not in 10, 20 30 or 15");
        }
        
        int num = 5;
        int mask = (1 << 3)  - 1;
        System.out.println(mask ^ num);

        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        return Integer.parseInt(decimalToBinary(num), 2);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2 == 0 ? 1 : 0);
            decimal /= 2;
        }

        return binary.toString();
    }
}
