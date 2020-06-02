/*Программа запрашивает шестизначное число. После ввода определяет, будет ли являться 
* «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой
* трех последних).
*/
package Task3_1;

import java.util.Scanner;

public class Task3_12 {
	static int numbers;
	static String resultItog;

	public static class Dismemberment {

		public Dismemberment(int a) {
			short firsttrio, secondtrio;
			secondtrio = (short) ((int) a % 1000);
			firsttrio = (short) ((int) a / 1000);
			resultItog = Result(Summer(firsttrio), Summer(secondtrio));
		}

		private byte Summer(short a) {
			byte resultSum = 0;
			while (a > 0) {
				resultSum += (byte) ((short) (a % 10));
				a /= 10;
			}
			return resultSum;
		}

		private String Result(byte a, byte b) {
			String result;
			result = (a == b) ? "Da /are you happy?/" : "No /noch einmal?/";
			return result;
		}
	}

	public static void main(String[] args) {
		System.out.print("Введите число для определения/write 6 numbers: \t");
		Scanner scn = new Scanner(System.in);
		numbers = scn.nextInt();
		scn.close();
		new Dismemberment(numbers);
		System.out.print("\t\t\t" + resultItog);
	}

}
