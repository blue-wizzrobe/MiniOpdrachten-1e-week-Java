import java.util.Scanner;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Voer een tekst in die je in volgorde wilt zetten");
        String input = scan.nextLine();
        System.out.println("Ingevoerde tekst: " + input);
        input = input.toLowerCase();
        char charArray[] = input.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
