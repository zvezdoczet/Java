package Task3_1;

/*�������. ���� ����� �� ��������� �������� ������������ x � y, ���������� � ������� � �������, 
� ����� �������� ��������� �����, � ������������� (����������) ������� ���������.
�������� ���������� �������� �������.
*/
import java.util.Scanner;

public class Task3_4 {
    static float x, y;
    private static String osi;
    private static byte quatro;
    
    public static void main(String[] args) {
        quatro = 0;
        osi = " ������ ���������.";
        System.out.print("������� ���������� �: ");
        Scanner scn = new Scanner(System.in);
        x = scn.nextFloat();
        System.out.print("������� ���������� Y: ");
        y = scn.nextFloat();
        scn.close();
        doOsnUsl(x, y);
    }
    
    private static void doOsnUsl(float a, float b) {
        if ((x==0)&(y!=0)) {osi = " ��� �."; outputXY(osi);}
        if ((x!=0)&(y==0)) {osi = " ��� X."; outputXY(osi);}
        if ((x>0)&(y>0)) {quatro = 1; osi = " ��."; outputXY(quatro, osi);}
        if ((x<0)&(y>0)) {quatro = 2; osi = " ��."; outputXY(quatro, osi);}
        if ((x<0)&(y<0)) {quatro = 3; osi = " ��."; outputXY(quatro, osi);}
        if ((x>0)&(y<0)) {quatro = 4; osi = " ��."; outputXY(quatro, osi);}
        else if ((x==0)&(y==0)) outputXY(osi);
    }
    
    private static void outputXY(byte quatro, String osi) {
        System.out.println("���������� ("+ x+ " ; "+ y +") �: " + quatro +" ��������." + "/���" + osi);
    }

    private static void outputXY(String osi) {
        System.out.println("���������� ("+ x+ " ; "+ y +") ��: " + osi);
    }
}
