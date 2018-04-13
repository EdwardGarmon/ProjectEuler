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
public class Problem_25 {
    
    ArrayList<Long> sum = new ArrayList();
ArrayList<Long> number1 = new ArrayList();    
ArrayList<Long> number2 = new ArrayList();    
ArrayList<Long> number3 = new ArrayList();
    void initArray(){
        for(int i = 0; i< 1000; i++){
           sum.add(0l); 
           number1.add(0l);
           number2.add(0l);
           number3.add(0l);
                           
                   
        }
    }
    
    
  ArrayList<Long> addArrays(ArrayList<Long> num1, ArrayList<Long> num2){
      
      for(int i = 0; i<num1.size(); i ++){
         num2.set(i, num2.get(i)+num1.get(i));
          for (int x = 0; x < num2.size() - 1; x++) {

            num2.set(x + 1, num2.get(x + 1) + (num2.get(x) - num2.get(x) % 10) / 10);
            num2.set(x, num2.get(x) % 10);
            
        }
      }
      return(num2);
  }
    
  void fibArray(){
    
    
    int x = 0;
    initArray();
    number1.set(0, 1l);
    while(number3.get(999)==0){
        
        
       
        
        number3 = addArrays(number2,number1);
        System.out.println(number3);
        number1 = number2;
        number2 = number3;
        
        
        x++;
        
    }
    
    System.out.println(x);
}
}