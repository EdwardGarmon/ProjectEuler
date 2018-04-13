/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;
/**
 *
 * @author Edward
 */
public class Problem_26 {
    
int findRepetition( int input){
    ArrayList<Integer>  list = new ArrayList();  
    ArrayList<Integer>  list2 = new ArrayList(); 
    BigInteger big ;
    int remain = 10;
    int count = 0;
    int divCount = 0;
    while(!(list.contains(remain))){
        
       list.add(remain);
       
       while(input>remain){
           remain = remain*10;
           count++;
           
           
       }
       while(remain>input){
           remain = remain - input;
           divCount++;
       } 
       list2.add(divCount);
       divCount = 0;
       
       count++;
      
      
    }
    
    list.add(remain);
    System.out.println(list);
    System.out.print(list2);
    System.out.println(list.get(list.size()-1));
    return count;

     
     
 }   
 /*int findLength(){
     
 }*/

    void testAll(){
        int largest;
        largest = 0;
        for(int i = 1; i< 1001; i ++){
            
            if(findRepetition(i)>largest){
                largest = i;
            }
            System.out.println(largest);
        }
        System.out.println(largest);
    }


}







    

