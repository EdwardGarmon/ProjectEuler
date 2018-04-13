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
public class Problem_15 {

    double[][] arr = new double[21][21];

    void solve() {
       
       
        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {
                if(x==0||y==0){
                    arr[x][y] = 1;
                }else{
                arr[x][y] = arr [x-1][y] + arr[x][y-1];
                }
            }
        }
        System.out.println(arr[20][20]);
    }

}
