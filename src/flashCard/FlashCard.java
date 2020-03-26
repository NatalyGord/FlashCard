package flashCard;
import java.util.Scanner;
public class FlashCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();
        String definition = scanner.nextLine();
        System.out.println(card);
        System.out.println(definition);
        String ans = scanner.nextLine();
        System.out.println(ans);
        if(ans.equals(definition)){
            System.out.println("Your answer is right!");
        }
        else{
            System.out.println("Your answer is wrong...");
        }
    }
}
