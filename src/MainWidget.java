public class MainWidget implements Uiwidget {
    @Override
    public void drag() {
        System.out.println("Dragging MyWidget...");
    }

    @Override
    public void render() {
        System.out.println("Rendering MyWidget...");
    }

    @Override
    public void resize(int x) {
        System.out.println("Resizing to width: " + x);
    }

    @Override
    public void resize(int x, int y) {
        System.out.println("Resizing to width: " + x + ", height: " + y);
    }

    @Override
    public void resizeTo(Uiwidget widget) {
        System.out.println("Resizing to match another widget");
    }
}
