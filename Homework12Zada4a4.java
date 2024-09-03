import java.util.ArrayList;

public class Homework12Zada4a4 {
    private Integer num4;
    private ArrayList<Integer> numArr = new ArrayList<>();
    private Integer count = 0;


    public void getSumNum(Integer num4){
        System.out.println("You input the number: "+num4);
        while ((num4/10) != 0){
            numArr.add(num4%10);
            num4 /= 10;
        }
        numArr.add(num4%10);
        for (Integer i : numArr){
            System.out.println(" The digits  of your number are: "+i);
            count += i;
        }
        System.out.println("The sum of digits is: "+count);
    }
}
