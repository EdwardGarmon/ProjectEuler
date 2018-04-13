//packages are like folders.  They allow you to organize your files.
// They ALWAYS begin with a lower case letter.
package ProjectEuler;

import java.util.Arrays;
//This is the class declaration.  Note that the name HelloWorld begins with a capital letter.

public class MainClass {

    //This is the main class.  It's always there once per project.  This is the 
    //method that is ran when you hit the play button up above.  
    public static void main(String[] args) {
    	//Problem p2 = new Problem_02();
    	//p2.solve();
    	long startTime = System.currentTimeMillis();
    	Problem_04 p4 = new Problem_04();
    	
    	long endTime = System.currentTimeMillis();
    	System.out.println("Took "+(endTime - startTime) +" ms");
    }
}
