package Task3_1;
// Написать программу, которая предлагает пользователю ввести c клавиатуры номер дня недели, и в ответ 
// показывает название этого дня (например, 6 – это суббота). Решить с использованием switch.

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		System.out.print("Введите число дня недели: ");
		Scanner sc = new Scanner(System.in);
		int nd = sc.nextInt();
		sc.close(); 
		String dw = " нет такого дня ";
		switch (nd) {
		case 1:
			dw = " понедельник / Monday ";
		break;
		case 2:
			dw = " вторник / Tuesday ";
		break;
		case 3:
			dw = " среда / Wednesday ";
		break;
		case 4:
			dw = " четверг / Thurday ";
		break;
		case 5:
			dw = " пятница / Friday ";
		break;
		case 6:
			dw = " суббота / Saturday ";
		break;
		case 7:
			dw = " воскресенье / Sunday ";
		break;
		}
		System.out.print(nd + " Это будет => " + dw);
	}
}
		
	
