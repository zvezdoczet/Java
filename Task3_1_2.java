package Task3_1;

import java.util.Scanner;

public class Task3_1_2 {
	static String day;
	private static void DayWeek(int a) { 
	day = " нет такого дня ";
	switch (a) {
	case 1:
		day = " понедельник / Monday ";
	break;
	case 2:
		day = " вторник / Tuesday ";
	break;
	case 3:
		day = " среда / Wednesday ";
	break;
	case 4:
		day = " четверг / Thurday ";
	break;
	case 5:
		day = " пятница / Friday ";
	break;
	case 6:
		day = " суббота / Saturday ";
	break;
	case 7:
		day = " воскресенье / Sunday ";
	break;
	}
}
	public static void main(String[] args) {
		System.out.print("Введите число дня недели: ");
		Scanner sc = new Scanner(System.in);
		int nd = sc.nextInt();
		sc.close(); 
		DayWeek(nd);
		System.out.print(nd+" это будет " + day);
	}
}
