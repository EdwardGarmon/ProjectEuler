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
public class Problem_44 {

    double pN(double n) {
        double outPut;
        outPut = n * (3 * n - 1) / 2;
       // System.out.println(outPut);
        return outPut;

    }

    void solve() {

        boolean notFound;
        notFound = true;
        for (int n = 1; notFound; n++) {
            for(int x = 1; x<n; x++){
                if(isPentagon(pN(n)+pN(x))){
                    if(isPentagon(Math.abs(pN(n)-pN(x)))){
                        System.out.println(pN(n)+" "+pN(x));
                        notFound = false;
                    }
                }
            }
        }

    }

    boolean isPentagon(double n) {
        double value = (1 + Math.sqrt(1 + 24 * n)) / 6;
        if (value % 1 == 0) {
            return true;
        }
        return false;
    }
}
