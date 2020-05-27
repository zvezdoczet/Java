package Task3_1;
// Написать программу, которая предлагает пользователю выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
// ответ показывает, какие звуки издает выбранное животное. В списке должно быть не менее 10 животных.
import java.util.Scanner;
public class Task3_3 {
	static int nm;
	static String say;
	private static String Task3(int nom) {
		nm = nom;
		switch (nm) {
		case 1:
			return say = " mjau-mjau";
		case 2:
			return say = " gau-gau";
		case 3:
			return say = " mu-mu-u";
		case 4:
			return say = " igo-go";
		case 5:
			return say = " ku-ka-re-ku";
		case 6:
			return say = " bere-bere";
		case 7:
			return say = " hru-hru";
		case 8:
			return say = " tchu-tchu";
		case 9:
			return say = " ku-ku";
		case 10:
			return say = " qau-qau";
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.print("1-cat\t");
		System.out.print("2-dog\t");
		System.out.print("3-cow\t");
		System.out.print("4-horse\t");
		System.out.print("5-cock\t");
		System.out.print("6-ram\t");
		System.out.print("7-pig\t");
		System.out.print("8-snake\t");
		System.out.print("9-cuckoo\t");
		System.out.print("10-frog\t");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nВведите номер животного: ");
		nm = sc.nextInt();
		sc.close();	
		Task3(nm);
		System.out.println("Голос этого животного - "+ say + Task3(nm));
	}
}
