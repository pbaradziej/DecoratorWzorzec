public class Text extends TextComponent {

    String name;

    Text(String name){
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print(name);
    }
}
