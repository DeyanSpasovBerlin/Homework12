import java.util.Scanner;
import java.time.LocalDateTime;

public class Homework12MainNew {
    public static void main(String[] args) {
        Homework12Zada4a1New zad1New =new Homework12Zada4a1New(){};
        Homework12Zada4a2New zad2New = new Homework12Zada4a2New(){};
        Homework12Zada4a3 zad3 = new Homework12Zada4a3(){};
        Scanner reader = new Scanner(System.in);
        Integer chois;
        do{
            System.out.println("\nChoose: \t1. Zada4a1\t2. Zada4a2 \t3. Exit");
            chois= reader.nextInt();
            if(chois.equals(1)){
                zad1New.canByu();
            } else if (chois.equals(2)) {
                zad2New.printYear();
            } else if (chois.equals(3)) {
                System.out.println("Goodbyu!");
                break;
            }else {
                System.out.println("Input 1 to 5");
            }
        }while (true);

    }
}
