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
public class Problem_40 {

    void solve() {
        double digits;
        digits = 0;
        double finalV;
        finalV = 1;
        double count;
        count = 0;
        for (double i = 1; count < 7; i++) {
            
            digits += digitsOf(i);

            if (digits >= Math.pow(10, count)) {
                if(digits>Math.pow(10, count)){
                     finalV *= getDigit(i, digits - Math.pow(10, count) );  
                     
                }else{
                     finalV *= getDigit(i, digits - Math.pow(10, count));  
                    
                }
                
                
                count++;
            }
        }
        System.out.println(finalV);

    }

    double getDigit(double n, double point) {
        String str = Double.toString(n);
        int length = str.length() - 2;
        String newStr = str.substring(0, length);

        double outPut = newStr.charAt(newStr.length()-1-(int) point ) - 48;

        return outPut;
    }

    double digitsOf(double n) {
        return Math.floor(Math.log10(n)) + 1;
    }

}
