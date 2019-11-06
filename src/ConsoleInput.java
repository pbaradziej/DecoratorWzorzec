import java.util.Scanner;

class ConsoleInput {
    private String text;
    private Scanner in = new Scanner(System.in);

    ConsoleInput(){
        text = setText();
    }

    private String setText() {
        System.out.print("Enter text to add tags: ");
        return in.nextLine();
    }

    String getText() {
        return text;
    }
}
