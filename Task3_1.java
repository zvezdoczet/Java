package Task3_1;
// �������� ���������, ������� ���������� ������������ ������ c ���������� ����� ��� ������, � � ����� 
// ���������� �������� ����� ��� (��������, 6 � ��� �������). ������ � �������������� switch.

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		System.out.print("������� ����� ��� ������: ");
		Scanner sc = new Scanner(System.in);
		int nd = sc.nextInt();
		sc.close(); 
		String dw = " ��� ������ ��� ";
		switch (nd) {
		case 1:
			dw = " ����������� / Monday ";
		break;
		case 2:
			dw = " ������� / Tuesday ";
		break;
		case 3:
			dw = " ����� / Wednesday ";
		break;
		case 4:
			dw = " ������� / Thurday ";
		break;
		case 5:
			dw = " ������� / Friday ";
		break;
		case 6:
			dw = " ������� / Saturday ";
		break;
		case 7:
			dw = " ����������� / Sunday ";
		break;
		}
		System.out.print(nd + " ��� ����� => " + dw);
	}
}
		
	
