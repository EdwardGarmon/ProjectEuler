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
public class Problem_49 {

    ArrayList<Integer> primes = new ArrayList();

    void findAllPrimes() {
        for (int i = 1000; i <= 9999; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    void Solve() {
        findAllPrimes();
        boolean looking;
        looking = true;
        for (int i = 0; i < primes.size() && looking; i++) {
            int x = 1;
            while (i + x < primes.size()) {
                if (arePerm(primes.get(i), primes.get(i + x))) {
                    int jump = primes.get(i + x) - primes.get(i);

                    int jumpN = primes.get(i + x) + jump;

                    if (isPrime(jumpN)) {
                        if (arePerm(jumpN - jump, jumpN)) {
                            System.out.println(primes.get(i) + " " + (jumpN - jump) + " " + jumpN);
                        }
                    }
                    
                }
                x++;


            }

        }

    }

    boolean noRepeats(String str) {

        for (int x = 1; x <= 9; x++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) - '0' == x) {
                    count++;

                    if (count > 1) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
    
    int count(String str, int n){
        int count = 0;
        for(int i =0; i<str.length();i++ ){
            if((str.charAt(i)-48)==n){
                count++;
            }
        }
        return count;
    }
    
    boolean arePerm(int n1, int n2) {
        String str1 = String.valueOf(n1);
        String str2 = String.valueOf(n2);
        boolean isPerm;
        isPerm = true;
        for(int i = 0; i<=9 && isPerm; i++){
            if(count(str1,i)!=count(str2,i)){
                isPerm = false;
            }
        }
        return isPerm;
        
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
