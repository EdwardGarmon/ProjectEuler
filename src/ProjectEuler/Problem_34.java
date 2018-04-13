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
public class Problem_34 {
    
    double factorialDigits(double num ){
        double sum = 0;
        double digit;
        double digits =Math.floor(Math.log10(num));
        for(double i =digits ;i>=0;i--){
            digit = Math.floor(num /Math.pow(10, i));
            num = num - digit*Math.pow(10, i);
            sum +=fact(digit);
        }
        return sum;
    }
    
    
    double fact(double num){
        double f = 1;
        for(double i = num; i>0; i--){
            f = f *i;
        }
        return f;
    }
    public void solve(){
        double sum =0; 
        for(double i =3; i<1000000;i++){
            if(i == factorialDigits(i)){
                sum+=i;
                System.out.println(i);
                
            }
        }
        System.out.println(sum);
    }
}
