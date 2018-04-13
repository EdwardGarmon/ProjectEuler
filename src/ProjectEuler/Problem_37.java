/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

/**
 *
 * @author Edward
 */
public class Problem_37 {

    void solve() {
        double sum;
        sum = 0;

        for (int i = 8; i < 1000000; i++) {
            if (noZeros(i)) {
                if (rTruncate(i, 0)) {

                    sum += i;
                    System.out.println(i);

                }
            }
        }
        System.out.println(sum);
    }

    boolean noZeros(double n) {
        String str = Double.toString(n);
        boolean bol;
        bol = true;
        for (int i = 1; i < str.length() - 3; i++) {

            if (str.charAt(i) == '0') {

                bol = false;
            }
        }
        return bol;
    }

    boolean rTruncate(double n, double rem) {

        boolean stillPrime;
        stillPrime = isPrime(n) && isPrime(rem);

        if (n == 0) {
            stillPrime = isPrime(rem);
        }
        if (rem == 0) {
            stillPrime = isPrime(n);

        }

        if (n > 0 && stillPrime) {

            rem *= 10;
            rem += Math.floor(n / Math.pow(10, Math.floor(Math.log10(n))));

            n -= Math.floor(n / Math.pow(10, Math.floor(Math.log10(n))))
                    * Math.pow(10, Math.floor(Math.log10(n)));

            stillPrime = rTruncate(n, rem);

        }

        return stillPrime;

    }

    public boolean isPrime(double number) {
        number = Math.abs(number);
        double num = 2;
        boolean bool = true;
        if (number == 2) {
            return true;
        }
        if (number < 2) {
            return false;
        }
        while ((num <= Math.pow(number, .5)) && (bool)) {
            if (number % num == 0) {
                bool = false;
            }
            num++;
        }
        return bool;
    }
}
