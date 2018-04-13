/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Edward
 */
//ANSWER!!
//524
//837799
public class Problem_14 {
   ArrayList<Long> chainLogFile = new ArrayList();
   ArrayList<Long> collatzLogFile = new ArrayList();
   public void run(){
       for (long i = 2; i<=1000000; i++){
           chainLogFile.add(sequence(i));
           collatzLogFile.add(i);
       }
       findBiggestNumber(); 
       
       
   }
   
   public long sequence(long collatz){
       long chainNumber = 0;
       for(int i = 0; collatz != 1; i++){
           if(collatz%2==0){
               collatz = collatz/2;
           }else {
               collatz = 3*collatz +1;
           }
           
           chainNumber++;
       }

       return chainNumber;
   }
   
    public void findBiggestNumber() {
        int bsf = 0;

        for (int i = 0; i < chainLogFile .size() - 1; i++) {

            if (chainLogFile .get(bsf) < chainLogFile .get(i + 1)) {
                bsf = i + 1;
            } else if (Objects.equals(chainLogFile .get(bsf),
                    chainLogFile .get(i + 1))) {
                bsf = i + 1;
            }

        }
        System.out.println(bsf);
        System.out.println(chainLogFile .get(bsf));
        System.out.println(collatzLogFile.get(bsf));

    }
}
