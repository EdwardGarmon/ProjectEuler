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
public class Problem_33 {

    void solve() {

        double val1;
        double val2;
        double val3;
        double val4;

        for (double i = 99; i > 0; i--) {
            for (double x = 1; x <= 99; x++) { 
                val1 = Math.floor(i / 10);
                val2 = x - Math.floor(x / 10) * 10;
                val3 = i - Math.floor(i / 10) * 10;
                val4 = Math.floor(x / 10);
                if((i/x)==val1/val2){
                    if(val3 == val4){
                        if( val1!=val3){
                             System.out.println(i+"/"+x); 
                        }
                      
                    }
                

            }

        }
    }

}
}

