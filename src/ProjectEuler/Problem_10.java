/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import static java.lang.Math.pow;

/**
 *
 * @author Edward
 */
public class Problem_10 {
   //possible answer -->1.4291182893E11
   public void solve(){
       double answer = 0;
    for(double i =1;   i < 2000000; i++){
         
       
        if(isPrime(i)){
            
            
            
            answer = i + answer;
        }
}
    System.out.println(answer);
   
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
