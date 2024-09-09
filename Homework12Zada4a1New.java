import java.time.LocalDateTime;

public class Homework12Zada4a1New{
    private Boolean isEdekaOpen;
    private Boolean isReweOpen;
    //private Boolean canBuy;
    Integer timeNowNew = LocalDateTime.now().getHour();
    public void canByu() {
        System.out.println("Сейчас "+timeNowNew+" часа.");
        isEdekaOpen = (timeNowNew >= 6 && timeNowNew <= 20) ? true : false;
       isReweOpen = (timeNowNew >= 7 && timeNowNew <= 21) ? true : false;
       String result1 = (isEdekaOpen && isReweOpen) ? "Сейчас откытые и Edeka и Rewe!" : (isEdekaOpen && !isReweOpen) ? "Сейчас откытo  Edeka!" : (!isEdekaOpen && isReweOpen) ? "Сейчас откытo  Rewe!" : "Сейчас закрытые и Edeka и Rewe!";
        System.out.println(result1);
    }
}