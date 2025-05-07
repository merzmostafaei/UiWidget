public interface Uiwidget extends Dragable, Resizable {

    //void drag(); // if we change the resize interface we make effect on Dragger class
    // so we seprate drag method to new interfaces.

    void render();
}

