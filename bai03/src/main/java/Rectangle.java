//extends in Java = inherit,
//extends in Swift = "decorator pattern"
public class Rectangle extends Shape {
    //custom constructor

    public Rectangle(Double width, Double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    private Double width;
    private Double height;
    //@Override = Annotation
    //override
    @Override
    public Double getArea() {
        return height * width;
    }
    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
