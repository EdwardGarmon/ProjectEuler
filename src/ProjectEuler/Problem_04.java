/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.ArrayList;

/**
 *
 * @author Edward answer: 906609
 */
public class Problem_04 extends Problem {

	public void solve() {

		double biggest = 0;

		for (int u = 1; u <= 99; u++) {

			for (int i = 1; i <= 99; i++) {

				double number = (900 + i) * (900 + u);

				if (isPalindrome(number)) {
					biggest = number;
				}
			}

		}
		System.out.println(biggest);

	}

	boolean isPalindrome(double num) {
		String str = String.valueOf(num);
		str = str.substring(0, str.length() - 2);
		
		return isPalindrome(str);
	}

	boolean isPalindrome(String str) {
	
		if (str.length() == 1 || str.equals("")) return true;

		if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

		str = str.substring(1, str.length() - 1);
		
		
		
		return isPalindrome(str);
	}

}
