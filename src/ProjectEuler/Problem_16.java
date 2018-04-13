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
public class Problem_16 {
//ANSWER: 1.0914283544526466E300
    
    ArrayList<Double> number = new ArrayList();
    
    public void power(double num, double num2) {
        initArray();
        for (double i = num2; i > 0; i--) {
                multiplyIntoArray(num);
        }
     System.out.println(number);
     double sum;
     sum =0;
        for(int i = 0; i<number.size(); i++){
            sum+=number.get(i);
        }
        
        System.out.println(sum);
    }
    
    void initArray(){
        number.add(1d);
        for(int i = 1; i<340; i++){
            number.add(0d);
        }
    }
    
    void multiplyIntoArray(double num){
        
    
    for (int i = 0; i < number.size() - 1; i++) {

        number.set(i, number.get(i) * num);
    }
        
        for (int i = 0; i < number.size() - 1; i++) {

            number.set(i + 1, number.get(i + 1) + (number.get(i) - number.get(i) % 10) / 10);
            number.set(i, number.get(i) % 10);

        }
        
    }
}
