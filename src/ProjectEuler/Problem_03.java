/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Edward
 */
public class Problem_03 {

	ArrayList<Long> listOfPrimes = new ArrayList();

	public void  solve() {
		findPrimeFactors(600851475143l);
		findBiggestNumber();
	}
	
	private void findPrimeFactors(long number) {

		for (long i = 2; !isPrime(number); i++) {
			if (number % i == 0) {
				number = number / i;
				if (isPrime(i)) {
					listOfPrimes.add(i);
				}
			}
		}
		listOfPrimes.add(number);

	}

	private void findBiggestNumber() {
		int bsf = 0;

		for (int i = 0; i < listOfPrimes.size() - 1; i++) {

			if (listOfPrimes.get(bsf) < listOfPrimes.get(i + 1)) {
				bsf = i + 1;
			} else if (Objects.equals(listOfPrimes.get(bsf), listOfPrimes.get(i + 1))) {
				bsf = i + 1;
			}

		}
		System.out.println(listOfPrimes.get(bsf));

	}

	private boolean isPrime(long number) {

		int x = 2;
		for (int i = 2; number % i != 0 && i < number / 2; i++) {
			x++;

		}
		if (number == 2) {
			return true;
		} else {
			return number % x != 0;
		}

	}

	private long findxprime() {
		long u = 0;
		long p = 0;
		for (long i = 1; u <= 10001; i++) {
			p = i;
			if (isPrime(i)) {
				u++;
			}

		}
		return p;
	}
}
