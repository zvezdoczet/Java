package Task;

import java.util.Scanner;
public class Task7 {
	public static void main(String [] args) {
		System.out.print("������� �������� ���. ��������� �� ����� (%) X:\t");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("������� �������� ������ ($):\t\t\t");
		int y = sc.nextInt();
		sc.close();
		float Nak;
		float x1 = x;
		float y2 = y;
		Nak = y2;
		for (int i=0; i<=23; i++) 
		Nak = Nak * (1+(x1/12/100)); 
		Nak *= 100; Nak = Nak - Nak%1; Nak /=100; //��� ���������� �� ���� ������ ����� �������
		System.out.println("����� ���� ��� ������ � ����� ($):\t\t" + Nak);	
	}
}