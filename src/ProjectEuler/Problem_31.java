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
public class Problem_31 {
    
    
    public void solve(){
        int count =0;
       for( int i = 1; i>=0; i--){
           for(int u = 2; u>= 0; u--){
               for( int y = 4; y>= 0; y--){
                   for( int t = 10; t>= 0; t--){
                       for( int r = 20; r>=0; r-- ){
                           for(int e = 40; e >= 0; e --){
                               for( int w = 100; w >= 0; w--){
                                   for(int q =200; q>= 0; q--){
                                      if((q + 2*w+5*e+r*10+t*20+50*y+
                                              100*u+i*200)==200){
                                          count ++;
                                      }
                                   }
                           }
                       }
                   }
               }
           }
       }
          
    }
       System.out.println(count);
    }
    
    
    
}
