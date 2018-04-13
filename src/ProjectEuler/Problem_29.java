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
public class Problem_29 {
    //Answer = 9183
    ArrayList<Double> powers = new ArrayList();
    
   public void solve(){
       double val;
       
       for (int i =2; i<=100;i++){{
           for(int x =2; x<=100;x++){
                val = Math.pow((double)i,(double) x);
               if(!(powers.contains(val))){
                   powers.add(val);
               }
           }
           }
       
       }
       System.out.println(powers.size());
   }
    
}
