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
public class Problem_38 {

    void solve() {
        double big = 0;
        double comp = 0;
        double si = 0;
        for (double i = 0; i < 9999; i++) {
            String str = function(i, 1, "");
            if (str.length() == 9) {
                comp = Double.valueOf(str);
                if (comp > big) {
                    big = comp;
                    si = i;
                }
            }
        }
        System.out.println(big + " " + si);
    }

    String function(double n, double i, String str) {
        String check;
        double buf;
        buf = n * i;

        String huf = String.valueOf(buf);
        huf = huf.substring(0, huf.length() - 2);
        check = str.concat(huf);
        if (noZerosOrRepeats(check)) {

            str = (function(n, i + 1, check));

        }

        return str;
    }

    boolean noZerosOrRepeats(String str) {

        if (str.contains("0")) {
            return false;
        }

        for (int x = 1; x <= 9; x++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) - '0' == x) {
                    count++;

                    if (count > 1) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
}
