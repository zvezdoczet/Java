/*ќпределить количество дней в году, который вводит пользователь, и вывести их в консоль. 
 * ¬ високосном году Ц 366 дней, тогда как в обычном Ц 365. ¬исокосными годами €вл€ютс€ 
 * все годы, дел€щиес€ нацело на 4, за исключением столетий, которые не дел€тс€ нацело на 400.
*/

package Task3_1;

import java.util.Scanner;

public class Task3_6 {
    static int year;

    public static void main(String[] args) {
        byte a = 0;
        System.out.print("¬ведите год: \t");
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();
        scn.close();
        if ((year % 100 == 0) & (year % 400 != 0))
            a = 2;
        else {
            if ((year % 100 == 0) & (year % 4 == 0))
                a = 1;
            else {
                if ((year % 100 != 0) & (year % 4 != 0))
                    a = 2;
                else
                    a = 1;
            }
        }
        System.out.print("Year/год: " + year);
        switch (a) {
            case 1: {
            System.out.println(" it's " + 366 + " days высокосный.");
            }
            break;
            case 2:
            System.out.println(" it's " + 365 + " days невысокосный/обычный.");
            break;
        }
    }
}
