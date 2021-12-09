import java.util.Scanner;

public class OpVakantie {
    public static void main(String[] args) {
        System.out.println("Ik ga op vakantie en neem mee...");
        runGame("Gezegd is: ");
    }

    static void runGame(String sentence) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.substring(0, 1).toUpperCase() + input.substring(1);
        String inputLow = input.toLowerCase();
        char inputFirst = inputLow.charAt(0);
        char sentenceLast = sentence.charAt(sentence.length() - 1);

        if (sentence == "Gezegd is: ") {
            sentence += input;
            System.out.println(sentence);
        } else if (inputFirst != sentenceLast){
            System.out.println(input + " begint niet met een '" + String.valueOf(sentenceLast).toUpperCase() + "'");
        } else {
            sentence += ", " + input;
            System.out.println(sentence);
        }
        System.out.println("Voer het volgende item in:");
        runGame(sentence);
    }
}
