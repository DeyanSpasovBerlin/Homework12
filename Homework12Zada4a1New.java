import java.time.LocalDateTime;

public class Homework12Zada4a1New{
    private Boolean isEdekaOpen;
    private Boolean isReweOpen;
    //private Boolean canBuy;
    Integer timeNowNew = LocalDateTime.now().getHour();
    public void canByu() {
        System.out.println();
        if (timeNowNew >= 6 && timeNowNew <= 20) {
            isEdekaOpen = true;
        } else {
            isEdekaOpen = false;
        }
        if (timeNowNew >= 7 && timeNowNew <= 21) {
            isReweOpen = true;
        } else {
            isReweOpen = false;
        }
        if(isEdekaOpen==true && isReweOpen==true){
            System.out.println("Сейчас откытые и Edeka и Rewe!");
        }else if (isEdekaOpen==true && isReweOpen==false){
            System.out.println("Сейчас откытo  Edeka!");
        } else if (isEdekaOpen==false && isReweOpen==true) {
            System.out.println("Сейчас откытo  Rewe!");
        }else {
            System.out.println("Сейчас закрытые и Edeka и Rewe!");
        }
    }
}