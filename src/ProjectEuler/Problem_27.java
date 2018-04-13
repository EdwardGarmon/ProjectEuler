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
public class Problem_27 {
    ArrayList<Double> phoPrimes = new ArrayList();
    ArrayList<Double> primes = new ArrayList();

    double function(double input, double b, double c) {

        return Math.pow(input, 2) + (input * b) + c;
    }

    
    
    public void test (){
        System.out.println(isPrime(function(4,-61,331)));
    }
    
    boolean checkPrime(double input){
        boolean bool = false;
        int x = 0;
        while(!bool&& x< primes.size()){
            if(input == primes.get(x)){
                bool = true;
            }else{
                x++;
            }
            
            
        }
        return bool;
    }
    
    public void checkAll() {
        double b = 0;
        double c = 0;
        double count;
        double bigCount =0;
        for (double i = -1000; i < 1000; i++) {
            for (double x = 0; x < primes.size(); x++) {
               count = 0;
                while (primes.contains(function(count,i,primes.get((int)x)))) {
                    
                    count++;

                }
                if (bigCount < count) {
                    bigCount = count;
                    b = i;
                    c = primes.get((int)x);
                }
               

            }
        }
        System.out.println(bigCount);
        System.out.println(b);
        System.out.println(c);
    }

    public void generatePrimeList() {
        for (double i = -1000; i < 1000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
     
       
        System.out.println(primes);
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
}
