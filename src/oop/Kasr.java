package oop;

public class Kasr {
    int surat;
    int mahraj;

    public void add(Kasr kasr) {
        int gcd = gcd(kasr.mahraj, mahraj);
        int res =  (gcd / kasr.mahraj * kasr.surat) + (gcd / mahraj * surat);
    }

    public void show() {
        System.out.println(surat / mahraj);
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
