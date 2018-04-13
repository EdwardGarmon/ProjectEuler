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
public class Problem_30 {

    public void solve() {
        double sum = 0;
        double val;
        for(double i = 0; i < 1000000; i++){
            val = pFunction(i);
            if(i == val){
                sum = val + sum;
            }
        }
        System.out.println(sum);
        
    }

    public double pFunction(double input) {
        double sum = 0;
        double digit;
        for (double i = Math.floor( Math.log10(input)) + 1; i >= 0; i--) {
            digit = Math.floor(input / Math.pow(10,  i));
            sum = sum + Math.pow(digit, 5);
            input = input - digit * Math.pow(10,  i);

        }
        return sum;

    }
}
