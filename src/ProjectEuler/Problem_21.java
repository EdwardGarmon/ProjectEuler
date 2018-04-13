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
public class Problem_21 {
   // solution =  40284
    ArrayList<Long> listOfA = new ArrayList();
    long solution;
    long aFunction(long num) {
        long num2;
        num2 = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num2 = num2 + num / i;
               
            }

        }

        return num2;
    }
    
   // 6, 28, 220, 284, 496, 1184, 1210, 2620, 2924, 5020, 5564, 6232, 6368, 8128
    //6, 53, 28, 75, 220, 331, 284, 267, 496, 543, 1184, 1257, 1210, 1231, 2620, 2971, 2924, 2667, 5020, 5611, 5564, 5067, 6232, 6415, 6368, 6279, 8128, 8175
    void solve(){
        for(long i = 1; i <=  10000; i ++){
            
            if(i==aFunction(aFunction(i))){
                if(i != aFunction(i )){
                    listOfA .add(i);
               solution = solution + i;
                }
                
            }
            
        }
        System.out.println(solution);
        System.out.println(listOfA);
    }
}
