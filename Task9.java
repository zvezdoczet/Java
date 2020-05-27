package Task;

public class Task9 {  
	public static void main (String[] args) {
		float [] czislo = {3.00f, 2.5f, 5.0f, 10.10f, 7.00f, 125.67f, 16.00f};
		for (int i = czislo.length-1; i>=0; i--)
		if (czislo[i]%1 == 0) System.out.println(czislo[i] + "\t - не имеет вещественной части,"); else System.out.println(czislo[i]+"\t - имеет вещественную часть,");
		System.out.println("количество проверенных чисел: " + czislo.length); // дополнительно к заданию
	}
}