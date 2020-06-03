import java.util.Scanner;

public class Task3_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите номер квартиры в 9-ти этажном доме: ");
        short numRoom = scn.nextShort();
        System.out.println("Введите количество квартир на этаже в 9-ти этажном доме: ");
        byte roomsLayer = scn.nextByte();
        scn.close();
        short n = (short) (roomsLayer * 9);
        byte p = ((numRoom % n) == 0) ? (byte) ((byte) (numRoom / n)) : (byte) ((byte) (numRoom / n) + 1);
        System.out.println(numRoom + " кв. при " + roomsLayer + " кв. на этаже будет в " + p + " подъезде, " +
                ((((-(p - 1) * roomsLayer * 9) + (numRoom - 1)) / roomsLayer) + 1) + " этаж.");
    }
}
