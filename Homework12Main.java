import java.time.LocalDateTime;
import java.util.Scanner;

public class Homework12Main {
    public static void main(String[] args) {
        Integer timeNow = LocalDateTime.now().getHour();
        System.out.println(" Now is "+timeNow+" o'clock and this mean that I can byu or not in Edeka and Rewe: ");
        Homework12Zada4a1 canByu = new Homework12Zada4a1(timeNow);
        canByu.printBuy(canByu.getByu());
        System.out.println("********************************************************");
        Scanner reader = new Scanner(System.in);
        System.out.println("Input any year and check is it Leap: \n");
        Integer year = reader.nextInt();
        Homework12Zada4a2 yearLeap = new Homework12Zada4a2();
        yearLeap.printYear(year);
        System.out.println("********************************************************");
        Homework12Zada4a3 minNum = new Homework12Zada4a3();
        System.out.println("Input first integer number:");
        Integer num1 = reader.nextInt();
        System.out.println("Input second integer number:");
        Integer num2 = reader.nextInt();
        System.out.println("Input third integer number:");
        Integer num3 = reader.nextInt();
        minNum.getMinNum(num1,num2,num3);
        System.out.println("********************************************************");
        System.out.println("Input integer number and see the sum of digits:");
        Integer num4 = reader.nextInt();
        Homework12Zada4a4 sumDigits = new Homework12Zada4a4(){};
        sumDigits.getSumNum(num4);
    }
}
