package geo;

public class Shape {
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    private int area;
    private String color;
    private int dim;
    public  Shape(){};
    public  void area(int dim, int dimb){
        System.out.println("I don't have detailsadf");
    }

    public Shape(String color, int dim, int dimb) {
        this.color = color;
        this.dim = dim;
        this.dimb = dimb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getDimb() {
        return dimb;
    }

    public void setDimb(int dimb) {
        this.dimb = dimb;
    }

    private int  dimb;


    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", color='" + color + '\'' +
                ", dim=" + dim +
                ", dimb=" + dimb +
                '}';
    }
}
