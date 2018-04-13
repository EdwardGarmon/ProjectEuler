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
public class Problem_20 {

   long solution;
    ArrayList<Long> number = new ArrayList();


    void arrayFactorial(long num) {
        
        for (long i = 0; i < 200; i++) {
            number.add(0l);
        }
        
        number.set(0, 1l);
        for (long i = num; i > 0; i--) {
            multiplyIntoArray(i);

        }
        

        System.out.println(number);

    }
    
    
    void addEverythingTogether(){
        solution = 0; 
        for (int i = 0 ; i< number.size(); i ++){
            solution = solution + number.get(i);
        }
        
        System.out.print(solution);
    }

    
    void multiplyIntoArray(long num){
        
    
    for (int i = 0; i < number.size() - 1; i++) {

        number.set(i, number.get(i) * num);
    }
        
        for (int i = 0; i < number.size() - 1; i++) {

            number.set(i + 1, number.get(i + 1) + (number.get(i) - number.get(i) % 10) / 10);
            number.set(i, number.get(i) % 10);

        }
        
    }
}
