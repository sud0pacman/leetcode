package greedy;

public class _2591_distMoney {
    public static void main(String[] args) {
        int money = 17;
        int children = 2;

        System.out.println(distMoney(money, children));
    }

    public static int distMoney(int money, int children) {
        if (money < children) return -1;
        money -= children;
        int count = money / 7;
        int mod = money % 7;

        System.out.println(count + "  " + mod);

        if (mod == 3 && count == children - 1) return count - 1;
        if (mod != 0 && count > children) return count-1;
        if (mod != 0 && count >= children) return children-1;

        return count;
    }
}
