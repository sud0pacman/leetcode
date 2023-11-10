package greedy;

import java.util.Arrays;

public class _860_lemonadeChange {
    public static void main(String[] args) {
        int[] ns = {5,5,10,10,20};
        System.out.println(lemonadeChange(ns));
    }

    public static boolean lemonadeChange(int[] bills) {
        int m5 = 0;
        int m10 = 0;

        for(int bill : bills) {
            switch (bill) {
                case 5: {
                    ++m5;
                    break;
                }
                case 10: {
                    if(m5 < 1) {
                        return false;
                    }

                    --m5;
                    ++m10;
                    break;
                }
                default: {
                    if(m10 > 0) {
                        if(m5 > 0) {
                            --m10;
                            --m5;
                        }
                        else return false;
                    }
                    else {
                        if (m5 > 2) {
                            m5 -= 3;
                        }
                        else return false;
                    }
                }
            }
        }

        return true;
    }
}