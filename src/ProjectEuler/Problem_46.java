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
public class Problem_46 {

    
    void solve(){
        boolean looking = true;
        for(int i = 33 ; looking; i+=2){
            if(!check(i)&&!isPrime(i)){
                System.out.println(i);
                looking = false;
            }
        }
    }
    
    
    boolean check(double n) {

        for (double i = n - 2; i > 0; i--) {
            double val = n - i;

            if (isPrime(val)) {
                if (Math.sqrt(i / 2) % 1 == 0) {
                    System.out.println(val+" "+ i);
                    return true;
                }
            }
        }
        return false;
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
