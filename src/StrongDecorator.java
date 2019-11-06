public class StrongDecorator extends TextComponentDecorator {

    StrongDecorator(TextComponent text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.print("<strong>");
        super.show();
        System.out.print("</strong>");
    }
}
