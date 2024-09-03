public class Homework12Zada4a2 {
    private  Integer year;
    public void printYear( Integer year){
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
