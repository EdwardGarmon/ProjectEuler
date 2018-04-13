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
public class Problem_07 {
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
    
    
    void solve(){
        double x =0;
        double i;
        for( i = 2; x!=10001; i++){
            if(isPrime(i)){
                x++;
            }
            
        }
        System.out.println(i-1);
    }
}
