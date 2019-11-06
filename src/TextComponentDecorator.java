class TextComponentDecorator extends TextComponent {

    private TextComponent text;

    TextComponentDecorator(TextComponent text) {
        this.text = text;
    }

    @Override
    public void show() {
        text.show();
    }
}
