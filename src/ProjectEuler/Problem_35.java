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
public class Problem_35 {

    ArrayList<Double> primes = new ArrayList();
    
    boolean rotateNum(double num) {
        double digit;
        double rest;
        boolean outPut = true;
        double digits = Math.floor(Math.log10(num));
        for (double i = digits; (i >= 0)&&outPut; i--) {
            digit = Math.floor(num / Math.pow(10, digits));
            rest = num - Math.floor(num / Math.pow(10, digits)) * Math.pow(10, digits);
            num = rest * 10 + digit;
            if(!isPrime(num)){
                outPut = false;
            }
        }
        
        return outPut;

    }
    
    public boolean isPrime(double number) {
        number = Math.abs(number);
        double num = 2;
        boolean bool = true;
        if(number == 2){
            return true;
        }
        if(number<2){
            return false;
        }
    while((num<=Math.pow(number, .5))&&(bool)){
        if(number%num==0){
            bool = false; 
        }
        num ++;
    }    
    return bool;
    }
    public void generatePrimeList() {
        for (double i = 0; i < 100; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
     
       
       
    }
    
    
    public void solve(){
        double count= 0;
       
        System.out.println("done");
        for(double i=10000000;i>0;i--){
            if(rotateNum(i)){
                System.out.println(count+" "+i);
                count++;
            }
        }
    }

}
