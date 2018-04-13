/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class Problem_43 {

    ArrayList<String> allPans = new ArrayList();

    void solve() {
        generateList();
        double sum;
        sum = 0;
        for (int i = 0; i < allPans.size(); i++) {
            
            if (primeStuff(allPans.get(i))) {
                System.out.println(allPans.get(allPans.size()-1));
                sum += Double.valueOf(allPans.get(i));
            }
        }
        System.out.println(sum);
    }

    boolean primeStuff(String n) {
        String str = String.valueOf(n);
        str = str.substring(0, str.length());
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        int p = 0;
        boolean output = true;
        for (int i = 1; i < str.length() - 2 && output; i++) {
            double d = Double.valueOf(str.substring(i, i + 3));

            if (d % primes[p] != 0) {

                output = false;
            }
            p++;
        }

        return output;
    }

    String cleanString(String str) {
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length();i++){
            for(int x = 0; x<=9; x ++){
                if(str.charAt(i)-48 == x ){
                    sb.insert(sb.length(), x);
                }
            }
        }

        return sb.toString();
         
    }

    void generateList() {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        permutate(list, 0);
    }

    double arrayToDouble(int[] list) {
        double num;
        num = 0;
        for (int i = 0; i < list.length; i++) {
            num = num + (double) (list[i] * Math.pow(10, list.length - i - 1));
        }
        return num;
    }

    public void permutate(int[] list, int pointer) {

        if (pointer == list.length) {

            allPans.add(cleanString(Arrays.toString(list)));

        }
        for (int i = pointer; i < list.length; i++) {
            int[] perm = (int[]) list.clone();

            perm[pointer] = list[i];

            perm[i] = list[pointer];

            permutate(perm, pointer + 1);

        }

    }
}
