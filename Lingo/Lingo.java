import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String word = "fiets";
        System.out.println("Geef een 5 letterwoord: _ _ _ _ _");
        String input = scan.nextLine().toLowerCase();
        if (input.length() != 5) {
            System.out.println("Je opgegeven woord was " + input.length() + " letters in plaats van 5");
            System.out.println("Geef een 5 letterwoord: _ _ _ _ _");
            input = scan.nextLine().toLowerCase();
        }   
        String code = "";
        for (int i = 0; i < 5; i++) {
            char letter = input.charAt(i);
            int index = word.indexOf(letter);
            if (index == -1) {
                code += "0";
            } else if (index == i) {
                code += "2";
            } else {
                code += "1";
            }
        }
        System.out.println(code);
    }
}
