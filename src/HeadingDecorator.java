public class HeadingDecorator extends TextComponentDecorator {

    HeadingDecorator(TextComponent text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.print("<h>");
        super.show();
        System.out.print("</h>");
    }
}
