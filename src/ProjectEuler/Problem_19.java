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
//Counting Sundays
//  1          2        3    4    5   6    7     8       9        10        11      12    
//Janurary Februrary March April May June July August September October November December
//   31      28/29     31   30   31   30   31    31       30      31        30     31              
public class Problem_19 {

    public void solve() {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year;
        int month = 1;
        int dayOfWeek = 1;
        int dayOfMonth = 1;
        int count = 0;
        for (year = 1900; year < 2001; ) {
                dayOfWeek++;
                dayOfMonth++;
            if (month == 2 && year % 4 == 0 && dayOfMonth > 29) {

                dayOfMonth = 1;
                month++;

            } else if (dayOfMonth > monthDays[month - 1]) {

                dayOfMonth = 1;
                month++;
            }

            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }
            if (month > 12) {
                month = 1;
                year++;
            }
            if (year > 1900) {
                if (dayOfWeek == 7) {
                    if (dayOfMonth == 1) {
                        count++;
                    }
                }

            }
            System.out.println(count);
        }

    }
}
