/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.Arrays;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class Problem_24 {

    long x = -1;
    int[] list = new int[]{0, 1, 2, 3,4,5,6,7,8,9};
    long test = 23000000l;

    ArrayList<Long> permList = new ArrayList();
    ArrayList<Long> sortList = new ArrayList();

    long arrayToLong(int[] list) {
        long num;
        num = 0;
        for (int i = 0; i < list.length; i++) {
            num = num + (long) (list[i] * Math.pow(10, list.length - i - 1));
        }
        return num;
    }

    public void moveIfTooLow(long z, long value) {

        if (!(0 == sortList.size()) && value < sortList.get((int) z - 1)) {

            moveIfTooLow((z - 1), value);
            System.out.println(z);
        } else {

            sortList.add((int) z, value);
            System.out.println(value);
            System.out.println(z);
        }

    }

    public void orderList() {
            sortList.add(permList.get(0));
        for (long i = 1; i < permList.size(); i++) {

            if (!sortList.isEmpty()) {
                long z = sortList.size() - 1;
                if (permList.get((int) i) > sortList.get((int) z)) {

                    sortList.add(permList.get((int) i));

                }else{

                while (permList.get((int) i) < sortList.get((int) z)) {
                    z--;
                    
                }
                sortList.add((int) z+1, permList.get((int) i));
                }
            }

            }
        
        System.out.print("done");
        }
//2783915460
    

    public void permutate(int[] list, int pointer) {

        if (pointer == list.length) {

            permList.add(arrayToLong(list));

        }
        for (int i = pointer; i < list.length; i++) {
            int[] perm = (int[]) list.clone();

            perm[pointer] = list[i];

            perm[i] = list[pointer];

            permutate(perm, pointer + 1);

        }

    }

}
