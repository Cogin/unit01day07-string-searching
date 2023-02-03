// good work
import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a HTML:");
        String html = scanner.nextLine();
        System.out.println("Enter a tag:");
        String tag = scanner.nextLine();

        int start = html.indexOf("<" + tag + ">");
        int end = html.indexOf("</" + tag + ">");

        if (start == -1 || end == -1) {
            System.out.println("No " + tag + " tag found.");
        } else {
            System.out.println(html.substring(start + tag.length() + 2, end));
            
        }
        scanner.close();
    }
}