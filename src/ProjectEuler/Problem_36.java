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
public class Problem_36 {

    ArrayList<Double> pals = new ArrayList();

    double reverse(double n) {
        double newSum;
        newSum = 0;
        double digit;
        double digits = Math.floor(Math.log10(n));

        for (double i = digits; i >= 0; i--) {
            digit = Math.floor(n / Math.pow(10, i)) * Math.pow(10, digits - i);
            newSum += digit;
            n -= Math.floor(n / Math.pow(10, i)) * Math.pow(10, i);
        }

        return newSum;

    }
   boolean checkPalindromic( double n){
        String str = Double.toString(n);
        str  = str.substring(0, str.length()-2);
        boolean pan;
        pan = true;
        for(int p1 = 0; p1< str.length(); p1 ++){
            int p2 =str.length()-1 - p1; 
            if ( str.charAt(p1) != str.charAt(p2)){
                pan = false;
            }
        }
        return pan;
    }
    public void generatePalList() {
        for (double i = 1; i < 1000000; i++) {
            if (i == reverse(i)) {
                pals.add(i);
               
            }
        }
    }

    double log2(double n) {
        return Math.floor(Math.log(n) / Math.log(2));
    }

    ArrayList<Integer> binaryForm(double n) {
        ArrayList<Integer> bin = new ArrayList();
        double b = log2(n);
        for (double i = b; i >= 0; i--) {
            if (n - Math.pow(2, i) >= 0) {
                bin.add(1);
                n -= Math.pow(2, i);
            } else {
                bin.add(0);

            }
        }
        return bin;
    }

    boolean checkBinPal(double n) {
        boolean bool = true;

        ArrayList<Integer> start;
        start = binaryForm(n);

        ArrayList<Integer> rev = new ArrayList();
        for (int i = start.size() - 1; i >= 0; i--) {
            rev.add(start.get(i));
        }

        for (int i = 0; i < start.size() && bool; i++) {
            bool = rev.get(i) == start.get(i);
        }
        return bool;
    }
    
    void solve(){
        double sum;
        sum = 0; 
        generatePalList();
        for(int i = 0; i<pals.size();i++){
            if(checkBinPal(pals.get(i))){
                sum += pals.get(i);
            }
        }
        System.out.println(sum);
    }

}
