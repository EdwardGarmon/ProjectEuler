/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.math.BigInteger;

/**
 *
 * @author Edward
 */
public class Problem_48 {

    void solve() {
        BigInteger sum = BigInteger.valueOf(0);

        for (int x = 1; x <= 1000; x++) {
            BigInteger pow = BigInteger.valueOf((long) x);
            pow = pow.pow(x);
            sum = sum.add(pow);
        }
        System.out.println(sum);
    }

}
