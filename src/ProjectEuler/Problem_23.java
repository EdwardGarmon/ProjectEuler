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
public class Problem_23 {

    ArrayList<Long> listOfAbundance = new ArrayList();

    long aFunction(long num) {
        long num2;
        num2 = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num2 = num2 + num / i;

            }

        }

        return num2;
    }

    void generateListOfAbundance() {
        for (long i = 0; i <= 28122; i++) {
            if (aFunction(i) > i) {
                listOfAbundance.add(i);
            }

        }
        System.out.println(listOfAbundance);

    }

    boolean checkSummability(long num) {
        int lowerBound;
        int upperBound;
        lowerBound = 0;
        upperBound = listOfAbundance.size() - 1;

        long boundSum = listOfAbundance.get(upperBound)
                + listOfAbundance.get(lowerBound);
        while (!(boundSum == num)
                && !(upperBound == lowerBound)) {

            if (boundSum > num) {
                upperBound--;
            }

            if (boundSum < num) {
                lowerBound++;
            }
            boundSum = listOfAbundance.get(upperBound)
                    + listOfAbundance.get(lowerBound);
        }
        return boundSum == num;
    }

    void Solve() {
        long solution;
        solution = 0;
        for (int i = 1; i < 28123; i++) {
            if (!checkSummability(i)) {
                solution = solution + i;
            }
            System.out.println(solution);
        }
    }
}
