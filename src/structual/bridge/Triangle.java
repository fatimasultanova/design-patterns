package structual.bridge;

public class Triangle implements Shape{

    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.paint();
        System.out.println("Triangle");

    }
}
