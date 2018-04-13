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
public class Problem_01 extends Problem {
    public void solve(){
        int sum = 0;
        for(int i = 1;i< 1000; i++){
            if(i%5==0){
                sum+=i;
            }
            if(i%3==0){
                sum+=i;
            }
            if(i%15==0){
                sum-=i;
            }
        }
        System.out.println(sum);
    }
    
    
    
}
