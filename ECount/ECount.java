import java.util.Scanner;

public class ECount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Voer een tekst in waar je het aantal 'e' van wilt weten");
        String input = scan.nextLine();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                counter++;
            }
        }

        System.out.println("De letter 'e' kwam " + counter + " keer voor in je tekst!");
    }
}