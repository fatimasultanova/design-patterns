package structual.bridge;

public class Circle implements Shape{

    private Color color;

    public Circle(Color color){
        this.color = color;
    }
    @Override
    public void draw() {
        color.paint();
        System.out.println("Circle");
    }
}
