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
public class Problem_12 {
//181467*
//1260.0
    ArrayList<Double> triangles = new ArrayList();
    ArrayList<Double> evenTriangles = new ArrayList();
    ArrayList<Double> divisibleNumbers = new ArrayList(); 

    public void makeABunchOfTriangularNumebers() {
        double triangle = 0;
        boolean b = true;
        triangles.add(0.0);
        for (int i = 1; i < 99999; i++) {
            triangle = triangles.get(i - 1) + i;
            triangles.add(triangle);
            
                }
        System.out.println("done");
        System.out.println(triangles);
        for(int i = 0; i< triangles.size()&&b;i++){
            double tri = triangles.get(i);
          
                
            
                if(countDivisors(triangles.get(i))>500){
                    b = false;
                    for(int x=0; x<tri;x++){
                        if(tri%x==0){
                           System.out.println(x); 
                           System.out.println(tri/x);
                           System.out.println(tri);
                        }
                        
                    
                
                }
            }
        }
    }
        
    
    

    public long countDivisors(double num) {
        long numberOfDivisors = 0;
        for (int i = 1; i <= Math.pow(num, .5) ; i++) {
            if (num % i == 0) {
                numberOfDivisors++;
                // System.out.println(i);
            }
        }
       
        return numberOfDivisors*2 ;
    }
    
    public void makeDivisibleNumbers(){
        double bigNumber = 1;
        for(int i = 1; i< 1000; i++){
            bigNumber = bigNumber * 2;
            System.out.println("big_Number:" + bigNumber);
           // if(  && triangles.contains(bigNumber)){
                System. out.println("found!" + bigNumber);
                
            }
}
}
    
    


