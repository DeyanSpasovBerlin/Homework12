import java.util.Scanner;

public class Homework12Zada4a2New {
    public void printYear(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input any year and check is it Leap: \n");
        Integer year = reader.nextInt();
        Integer flag = (year%100)%400;
            String result = ((year%100 == 0) && (year%400 == 0)) ? " Year "+year+" is Leap" : ((year % 4) == 0) ?    "Year "+year+" is Leap" : " Year "+year+" is not Leap";
            System.out.println(result);
    }
}
