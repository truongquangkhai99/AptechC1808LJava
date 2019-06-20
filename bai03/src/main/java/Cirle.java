public class Cirle extends Shape {
    private Double radius;
    Cirle(Double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public Double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
