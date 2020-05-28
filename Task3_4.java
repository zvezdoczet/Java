package Task3_1;

/*Задание. Дана точка на плоскости заданная координатами x и y, определить и вывести в консоль, 
в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
Четверти обозначены римскими цифрами.
*/
import java.util.Scanner;

public class Task3_4 {
    static float x, y;
    private static String osi;
    private static byte quatro;
    
    public static void main(String[] args) {
        quatro = 0;
        osi = " начале координат.";
        System.out.print("Введите координаты Х: ");
        Scanner scn = new Scanner(System.in);
        x = scn.nextFloat();
        System.out.print("Введите координаты Y: ");
        y = scn.nextFloat();
        scn.close();
        doOsnUsl(x, y);
    }
    
    private static void doOsnUsl(float a, float b) {
        if ((x==0)&(y!=0)) {osi = " оси У."; outputXY(osi);}
        if ((x!=0)&(y==0)) {osi = " оси X."; outputXY(osi);}
        if ((x>0)&(y>0)) {quatro = 1; osi = " всё."; outputXY(quatro, osi);}
        if ((x<0)&(y>0)) {quatro = 2; osi = " всё."; outputXY(quatro, osi);}
        if ((x<0)&(y<0)) {quatro = 3; osi = " всё."; outputXY(quatro, osi);}
        if ((x>0)&(y<0)) {quatro = 4; osi = " всё."; outputXY(quatro, osi);}
        else if ((x==0)&(y==0)) outputXY(osi);
    }
    
    private static void outputXY(byte quatro, String osi) {
        System.out.println("координаты ("+ x+ " ; "+ y +") в: " + quatro +" четверти." + "/Это" + osi);
    }

    private static void outputXY(String osi) {
        System.out.println("координаты ("+ x+ " ; "+ y +") на: " + osi);
    }
}
