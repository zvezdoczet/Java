package Task3_1;

import java.util.Scanner;

public class Task3_1_2 {
	static String day;
	private static void DayWeek(int a) { 
	day = " ��� ������ ��� ";
	switch (a) {
	case 1:
		day = " ����������� / Monday ";
	break;
	case 2:
		day = " ������� / Tuesday ";
	break;
	case 3:
		day = " ����� / Wednesday ";
	break;
	case 4:
		day = " ������� / Thurday ";
	break;
	case 5:
		day = " ������� / Friday ";
	break;
	case 6:
		day = " ������� / Saturday ";
	break;
	case 7:
		day = " ����������� / Sunday ";
	break;
	}
}
	public static void main(String[] args) {
		System.out.print("������� ����� ��� ������: ");
		Scanner sc = new Scanner(System.in);
		int nd = sc.nextInt();
		sc.close(); 
		DayWeek(nd);
		System.out.print(nd+" ��� ����� " + day);
	}
}
