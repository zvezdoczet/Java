/*���������� ���������� ���� � ����, ������� ������ ������������, � ������� �� � �������. 
 * � ���������� ���� � 366 ����, ����� ��� � ������� � 365. ����������� ������ �������� 
 * ��� ����, ��������� ������ �� 4, �� ����������� ��������, ������� �� ������� ������ �� 400.
*/

package Task3_1;

import java.util.Scanner;

public class Task3_6 {
    static int year;

    public static void main(String[] args) {
        byte a = 0;
        System.out.print("������� ���: \t");
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
        System.out.print("Year/���: " + year);
        switch (a) {
            case 1: {
            System.out.println(" it's " + 366 + " days ����������.");
            }
            break;
            case 2:
            System.out.println(" it's " + 365 + " days ������������/�������.");
            break;
        }
    }
}
