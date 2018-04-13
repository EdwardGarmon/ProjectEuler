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
public class Problem_39 {
    
    void solve(){
       int big; 
       int bigP;
       bigP=0;
       big = 0;
       for(int p = 0; p <1000; p++ ){
           int huh = findTriangle(p);
           if(huh>big){
             big = huh; 
             bigP = p;
           }
           
       }
       System.out.println(bigP);
    }
    

    int findTriangle(int perimeter) {
        int count;
        count = 0;
        
        for (int a = perimeter; a > 0; a--) {
            for (int c = 1; c < perimeter; c++) {

                int b = perimeter - (a + c);
                if (b > 0) {

                    double target;
                    target = Math.pow(a, 2);

                    if (Math.pow(b, 2) + Math.pow(c, 2) == target) {
                        count++;
                        a--;
                        //System.out.println(a + " " + b + " " + c);

                    }
                }
            }
        }

        return count;
    }

}
