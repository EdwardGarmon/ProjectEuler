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
public class Problem_47 {

    void solve() {
        boolean searching;
        searching = true;
        int count = 0;
        for (int i =1 ; searching; i++) {
            System.out.println(i);
            if (primeFactorsOf(i) == 4) {
                count++;
                if (count == 4) {
                    System.out.println(i - 3);
                    searching = false;
                }

            } else {
                count = 0;
            }
        }
    }

    int primeFactorsOf(double n) {
        boolean exit;
        exit = false;
        int count;
        count = 0;
        if (n == 1) {
            return 0;
        }
        if(isPrime(n)){
               // System.out.println(n);
                exit = true;
                count ++;
                n=1;
               
            }
        for (int i = 0; !exit && i <= n ; i++) {
            
            if (isPrime(i)) {
                if (n % i == 0) {
                    count++;
                    exit = true;
                   
                    while (n % i == 0) {
                        n /= i;
                    }
                    //System.out.println(i);
                }
            }
        }

       
        count += primeFactorsOf(n);
      // System.out.println(count);
        return count;
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
