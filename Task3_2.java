package Task3_1;
//� ���������� �������� ����� (���������� ����� �� 0 �� 24) � ��������� ������� �����������, ���������������
// ���������� ������� (��������, ����� 15 ����� � ��������� ����������� ������� �����).

import java.util.Scanner;
public class Task3_2 {
	public static void main(String[] args) {
		System.out.print("������� ������� ������ �����/hours: ");
		Scanner hours = new Scanner(System.in);
		int a = hours.nextInt();
		hours.close();
		String hi, hi1;
		hi = " Good "; hi1 = " lucky ";
		if (a<=24&a>=21) hi1 = " night.";
		if (a<21&a>=18) hi1 = " evening.";
		if (a<18&a>=12) hi1 = " day.";
		if (a<12&a>=6) hi1 = " morning.";
		if (a<6&a>=0) hi1 = " night.";
		System.out.print(a + " o'clock - " + hi + " " + hi1);
	}
}
