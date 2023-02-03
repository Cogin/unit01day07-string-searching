// nicely done
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a letter:");
        String letter = scanner.nextLine();

        int locator = sentence.indexOf(letter);

        if (locator == -1) { System.out.println("No '" + letter + "' found.");}
        else {
            int end = sentence.indexOf(" ", locator);
            if (end == -1) {end = sentence.length();}
            int start = sentence.lastIndexOf(" ", end - 1) + 1;

            System.out.println(sentence.substring(start, end));
            scanner.close();
        }
    }
}
