import java.util.Scanner;

public class Homework12Zada4a2New {
    //private  Integer year;
    public void printYear(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input any year and check is it Leap: \n");
        Integer year = reader.nextInt();
        Integer flag = (year%100)%400;
        if (year%100 == 0 ){
            if(year%400 == 0){
                System.out.println(" Year "+year+" is Leap");
            } else {
                System.out.println(" Year "+year+" is not Leap");
            }
        }else if((year % 4) == 0) {
            System.out.println(" Year "+year+" is Leap");
        } else {
            System.out.println(" Year "+year+" is not Leap");
        }
    }
}
