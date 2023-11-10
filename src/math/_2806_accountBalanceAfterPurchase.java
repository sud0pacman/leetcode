package math;

public class _2806_accountBalanceAfterPurchase {
    public static void main(String[] args) {
        int purchaseAmount = 15;
        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int amount = 10 - purchaseAmount%10;
        if (amount > 5) purchaseAmount -= 10-amount;
        else purchaseAmount += amount;

        return 100 - purchaseAmount;
    }
}
