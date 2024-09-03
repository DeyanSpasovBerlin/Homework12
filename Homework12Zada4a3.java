public class Homework12Zada4a3 {
    Integer num1;
    Integer num2;
    Integer num3;
    public void getMinNum(Integer num1, Integer num2, Integer num3){
        System.out.println("You input next 3 number: "+num1+", "+num2+", "+num3);
        if((num1 < num2) && (num1 < num3)){
            System.out.println(" Min number is: "+ num1);
        } else if ((num1 < num2) && (num1 > num3)) {
            System.out.println(" Min number is: "+ num3);
        } else {
            System.out.println(" Min number is: "+ num2);
        }
    }
}
