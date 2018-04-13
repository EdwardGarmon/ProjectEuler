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
public class Problem_05 {

    public int run() {
        int num1;
        int num2 = 3;
        for (int i = 2; i <= 20; i++) {
            num1 = i;
            num2 = findLcm(num1, num2) ;
        }
        return num2;
 
    }

    public int findLcm(int num1, int num2) {
        int Num1 = num1;
        int Num2 = num2;
        int Lcm = 1;

        if (Num1 == 1) {
            return Num2;
        } else if (Num2 == 1) {
            return Num1;
        } else {
            for (int i = 1; Lcm % Num2 != 0; i++) {
                Lcm = Num1 * i;
            }
            return Lcm;
        } 

       
    }

}
