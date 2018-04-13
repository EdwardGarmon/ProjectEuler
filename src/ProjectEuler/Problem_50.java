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
public class Problem_50 {

    void solve() {
        findAllPrimes();
        System.out.println("here");
        double finalPrime;
        double finalWidth;
        finalPrime = 0;
        finalWidth = 2;
       
         boolean found = false;
         
          for(int width = (int)finalWidth; width<primes.size()&&!found; width++ ){
              for(int start = 0; start<primes.size()-width; start++){
                  
              double target = primeSum(start,width);
              if(primeSum(0,width)>1000000){
                  found = true;
              }
                  if(target<1000000){
                      if(isPrime(target)){
                     
                      if(width > finalWidth){
                         
                            
                          finalWidth = width;
                          finalPrime = target;
                          }
                      }
                  }
                  else{
                      break;
                  }
              }
              
          
            
            
           
           
        }
          System.out.println(finalWidth + " " + finalPrime);
        
    }
    

    ArrayList<Double> primes = new ArrayList();

    
  
    
    double primeSum(int i, int ie) {
        double sum;
        sum = 0;
        for (int j = i; j < i + ie; j++) {
            sum += primes.get(j);
        }

        return sum;
    }

    void findAllPrimes() {

      
        for (double i = 2; i <= 1000000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    boolean fastCheck(double n) {

        for (int i = 0; i < primes.size(); i++) {

            if (n % primes.get(i) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime(double number) {
        number = Math.abs(number);
        double num = 2;
        boolean bool = true;
        if (number == 2) {
            return true;
        }
        if (number < 2) {
            return false;
        }
        while ((num <= Math.pow(number, .5)) && (bool)) {
            if (number % num == 0) {
                bool = false;
            }
            num++;
        }
        return bool;
    }
}
