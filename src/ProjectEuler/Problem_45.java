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
public class Problem_45 {

    void solve() {
        boolean looking = true;

        for (int i = 286; looking; i++) {
            double value = (Math.pow(i, 2)+i)/2;
            if(isPentagonal(value)){
                if(isHexagonal(value)){
                    System.out.println(value);
                    looking = false;
                }
            }

        }
    }

    boolean isPentagonal(double n) {
        double value = (1 + Math.sqrt(1 + 24 * n)) / 6;
        if (value % 1 == 0) {
            return true;
        }
        return false;
    }

    boolean isHexagonal(double n) {
        double value = (1 + Math.sqrt(1 + 8 * n)) / 4;
        if (value % 1 == 0) {
            return true;
        }
        return false;
    }

}
