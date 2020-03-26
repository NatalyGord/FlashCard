package flashCard;
import java.util.Scanner;
public class FlashCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int n = scanner.nextInt();
        String a = scanner.nextLine();
        String[] arrCard = new String[n];
        String[] arrDef = new String[n];
        for(int i = 1; i <= n; i++){
            System.out.printf("The card #%d: %n", i);
            arrCard[i - 1] = scanner.nextLine();
            System.out.println(arrCard[i - 1]);
            System.out.printf("The definition of the card #%d: %n", i);
            arrDef[i - 1] = scanner.nextLine();
            System.out.println(arrDef[i - 1]);
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("Print the definition of \"%s\": %n", arrCard[i]);

            String ans = scanner.nextLine();
            System.out.println(ans);
            if (ans.equals(arrDef[i])) {
                System.out.println("Correct answer.");
            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\". %n", arrDef[i]);
            }
        }
    }
}
