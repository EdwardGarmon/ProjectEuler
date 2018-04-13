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
public class Problem_41 {

   ArrayList<Double> allPans = new ArrayList();

   
   void solve(){
       boolean bool;
       bool = true;
       double big;
       big = 0;
       for(int i = 7; (i>0)&&bool;i--){
           int[] list = generateList(i);
           permutate(list,0);
           for(int x = allPans.size()-1;x>0;x--){
               if(isPrime(allPans.get(x))){
                   bool = false;
                   if(allPans.get(x)>big){
                       big = allPans.get(x);
                   }
               }
               
           }
           System.out.println(big);
           allPans.clear();
       }
   }
   
   
   public void permutate(int[] list, int pointer) {

        if (pointer == list.length) {

           allPans.add(arrayToDouble(list));

        }
        for (int i = pointer; i < list.length; i++) {
            int[] perm = (int[]) list.clone();

            perm[pointer] = list[i];

            perm[i] = list[pointer];

            permutate(perm, pointer + 1);

        }

    }
    
   double arrayToDouble(int[] list) {
        double num;
        num = 0;
        for (int i = 0; i < list.length; i++) {
            num = num + (double) (list[i] * Math.pow(10, list.length - i - 1));
        }
        return num;
    }
    int[] generateList( int n ){
        int[] list = new int[n];
        for(int i = 0; i<n; i++){
            list[i] = i+1;
        }
       
        return list;
    }

    public boolean isPrime(double number) {
        number = Math.abs(number);
        double num = 2;
        boolean bool = true;
        if (number == 2) {
            return true;
        }
        if (number < 2) {
            return false;
        }
        while ((num <= Math.pow(number, .5)) && (bool)) {
            if (number % num == 0) {
                bool = false;
            }
            num++;
        }
        return bool;
    }
}
