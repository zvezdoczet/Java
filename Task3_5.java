package Task3_1;

/*Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
года по китайскому календарю. Пример входных данных:
5 12 1974
Вывод:
Знак: Стрелец
Год: Тигра
*/

import java.util.Scanner;

public class Task3_5 {
    static String year = "mouse", month = "oven";
    private static String searSodiak (byte a) {
        byte b = (byte) ((byte) a-3);
        switch (b) {
            case 1:
			month = "oven";
			break;
			case 2:
			month = "telez";
			break;
			case 3:
			month = "blyznezy";
			break;
			case 4:
			month = "rak";
			break;
			case 5:
			month = "lev";
			break;
			case 6:
			month = "deva";
			break;
			case 7:
			month = "vezy";
			break;
			case 8:
			month = "skorpion";
			break;
			case 9:
			month = "strelez";
			break;
			case 10:
			month = "kozerog";
			break;
			case -2:
			month = "kozerog";
			break;
			case -1:
			month = "vodolej";
			break;
			case 0:
			month = "ruby";
			break;
			}
			return month;
	    }
	    
    private static String searSoodiak (short year1) {
        short b = (short) ((short) Math.abs((12+(year1-2008)%12))%12);
			switch (b) {
			case 0:
			year = "mouse";
			break;
			case 1:
			year = "buk";
			break;
			case 2:
			year = "tigre";
			break;
			case 3:
			year = "krolik";
			break;
			case 4:
			year = "drakon";
			break;
			case 5:
			year = "zmeja";
			break;
			case 6:
			year = "horse";
			break;
			case 7:
			year = "koza";
			break;
			case 8:
			year = "monkey";
			break;
			case 9:
			year = "petuch";
			break;
			case 10:
			year = "dog";
			break;
			case 11:
			year = "pig";
			break;
			}
			return month;
	}
    
    public static void main(String[] args) {
        System.out.println("Write birthday\n/день рождения/day-month-year/: ");
        Scanner scn = new Scanner(System.in);
        int i=0;
        byte day1 = 0; byte month1 = 0;
       	while ((i<=0)||(i>32))
        {day1 = scn.nextByte(); i = day1 ;};   
        i=0;
        while ((i<=0)||(i>13))
        {month1 = scn.nextByte(); i = month1;};
        short year1 = scn.nextShort();
        scn.close();
        System.out.print("\n" + day1 + " " + month1 + " " + year1);
        if (day1>22) month1 = (byte) (month1 + 1);
        searSodiak (month1);
        searSoodiak (year1);
        System.out.print("\nЗнак: " + month);
        System.out.print("\nГод/year: " + year);
	}
}
