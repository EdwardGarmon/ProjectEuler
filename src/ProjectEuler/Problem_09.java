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
public class Problem_09 {
    ArrayList<Double> doubles = new ArrayList();
   public void findTriples(){
        double c;
        double answer;
      for(double i = 1; i<=1000; i++){
          for(double u = 1000-i; u > 0; u--){
              if(checkTrue(i,u)){
                 
              c =  Math.pow(Math.pow(i, 2) + Math.pow(u, 2),.5);
                 if(i+u+c==1000 ){ 
                     answer = i*u*c;
                     System.out.println(i);
                     System.out.println(u);
                     System.out.println(c);
                     System.out.println(answer);
                 }
                  
                  
              }
          }
     
   }
     
      
    }
    public boolean checkTrue(double i, double u){
            double c;
       c =  Math.pow(Math.pow(i, 2) + Math.pow(u, 2),.5);
         return c%1 == 0;
        
    }
}
