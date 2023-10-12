package geo;

public class Triangle extends Shape {

    public Triangle() {
    }

    public Triangle(String color, int dim, int dimb) {
        super(color, dim, dimb);
    }

    @Override
    public void area(int dim, int dimb) {
        super.area((dim*dimb)/2);
    }
}
