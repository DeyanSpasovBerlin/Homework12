import java.time.LocalDateTime;

public class Homework12Zada4a1 {

        private Boolean isEdekaOpen;
        private Boolean isReweOpen;
        private Boolean canBuy;
        private Integer timeNow ;
        public  Homework12Zada4a1(Integer timeNow){
            this.timeNow = timeNow;
        }

        public Boolean getByu(){
            if(timeNow>=6 && timeNow <=20){
                isEdekaOpen = true;
            } else {
                isEdekaOpen = false;
            }
            if(timeNow >= 7 && timeNow <=21){
                isReweOpen = true;
            } else {
                isReweOpen = false;
            }
            if(isEdekaOpen || isReweOpen){
                canBuy = true;
            } else {
                canBuy = false;
            }
            return canBuy;
        }
        public void printBuy(Boolean flag){
            if(flag){
                System.out.println("Я могу купить еду, это "+flag);
            } else {
                System.out.println("Я не могу купит еду, ето " + flag);
            }

        }


}
