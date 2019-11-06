import java.util.Scanner;

class Menu {

    private TextComponent text;

    void menu() {
        boolean flag = true, flagText = false;
        Scanner in = new Scanner(System.in);
        int choice;
        input();

        while (flag) {

            if (flagText) {
                input();
                flagText = false;
            }

            System.out.println("\n1. <h>.....</h>\n" +
                    "2. <p>.....</p>\n" +
                    "3. <strong>.....</strong>\n" +
                    "4. clear input\n" +
                    "0. exit\n");

            System.out.print("Which operation?: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    text = new HeadingDecorator(text);
                    text.show();
                    System.out.println();
                    break;

                case 2:
                    text = new ParagraphDecorator(text);
                    text.show();
                    System.out.println();
                    break;

                case 3:
                    text = new StrongDecorator(text);
                    text.show();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Text cleared!");
                    flagText = true;
                    break;

                case 0:
                    System.out.println("Bye, bye :)");
                    flag = false;
                    break;

                default:
                    System.out.println("Unknown operation! :/");
                    break;
            }
        }
    }

    private void input() {
        ConsoleInput input = new ConsoleInput();
        text = new Text(input.getText());
    }
}
