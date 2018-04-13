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
public class Problem_28 {
    
    public void solve() {
        double sum =1;
        double count = 0; 
        double factor =2;
        double diagCount = 0;
        for (double i = 2 ; i<=1002001;i++ ) {
            count++;
            if(count == factor){
                sum = sum + i;
                diagCount++;
                count = 0;
                System.out.println(i);
                }
            if(diagCount ==4){
                diagCount = 0;
                factor = factor +2;
                
            }
        }
        System.out.println(sum);
    }

}
