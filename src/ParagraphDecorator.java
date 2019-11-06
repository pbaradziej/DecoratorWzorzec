public class ParagraphDecorator extends TextComponentDecorator {

    ParagraphDecorator(TextComponent text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.print("<p>");
        super.show();
        System.out.print("</p>");
    }
}
