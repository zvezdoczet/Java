package Task;

import java.util.Scanner;
public class Task7 {
	public static void main(String [] args) {
		System.out.print("Введите значение год. процентов на вклад (%) X:\t");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("введите величину вклада ($):\t\t\t");
		int y = sc.nextInt();
		sc.close();
		float Nak;
		float x1 = x;
		float y2 = y;
		Nak = y2;
		for (int i=0; i<=23; i++) 
		Nak = Nak * (1+(x1/12/100)); 
		Nak *= 100; Nak = Nak - Nak%1; Nak /=100; //для округления до двух знаков после запятой
		System.out.println("После двух лет вклада в банке ($):\t\t" + Nak);	
	}
}