/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.ArrayList;

/**
 *
 * @author Edward
 */
// Pandigital products
public class Problem_32 {

    ArrayList<Double> digits = new ArrayList();

    double digitsof(double n) {
        return Math.floor(Math.log10(n));
    }

    boolean noRepeat(double n1) {
        boolean outPut = true;
        double digit;

        for (double i = digitsof(n1); (i >= 0) && outPut; i--) {

            digit = Math.floor(n1 / Math.pow(10, i));

            n1 = n1 - digit * Math.pow(10, i);

            outPut = !digits.contains(digit);
            if (digit == 0){ outPut = false;}
            digits.add(digit);

        }
        return outPut;
    }

    boolean noRepeats(double n1, double n2, double n3) {

        boolean outPut = noRepeat(n1) &  noRepeat(n2) & noRepeat(n3);
        digits.clear();
        return outPut;
    }

    boolean isPandigital(double multi, double plier) {

        double product = multi * plier;
        if (digitsof(product) + digitsof(multi) + digitsof(plier) + 3 != 9) {

            return false;

        } else {
            return noRepeats(product, multi, plier);
        }
    }

    public void solve() {

        ArrayList<Double> products = new ArrayList();
        double sum = 0;
        double product;
        for (double i = 2 ; i < 99; i++) {
            for (double x = 5000 ; x > 2; x--) {
                if (isPandigital(i, x)) {
                    product =i*x;
                    if (!products.contains(product)) {
                        products.add(product);
                        sum += product;

                        System.out.println(x + "_" + i + "_" + i * x);

                    }
                }
            }
        }
        System.out.println(sum);

    }
}
