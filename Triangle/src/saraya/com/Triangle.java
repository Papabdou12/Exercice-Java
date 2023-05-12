package saraya.com;

public class Triangle  {

    private Double side1;
    private Double side2;
    private Double angle;
    private TriangleType type;

    public Triangle() {
    }

    public Triangle(Double side1, Double side2, Double angle , TriangleType type){
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
        this.type = type;
    }

    public Triangle(Double side1 , TriangleType type){
        this.type = type;
        this.side1 = side1;
    }

    public Triangle(Double side1, Double angle , TriangleType type){
        this.angle = angle;
        this.side1 = side1;
        this.type = type;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public TriangleType getType() {
        return type;
    }

    public void setType(TriangleType type) {
        this.type = type;
    }
}
