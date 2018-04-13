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
public class Problem_06 {
    public void run(){
        
        double sum = 0;
        double sum2 = 0;
        for(double i=1; i<=100; i++){
            sum = sum + Math.pow(i, 2);
            sum2 += i;
            System.out.println(sum2);
        }
        System.out.println(sum);
    }
}
