package saraya.com;
import saraya.com.TriangleType;

public class TriangleUtils extends Triangle {

    public static Double getSide3(Double side1 ,Double side2 ){
        return (side1 +side2);
    }
    public static Double PerimetreTriangle(Double side1 ,Double side2) {
        Double side3 = getSide3(side1, side2) ;
        return (side1 + side2 + side3);
    }

    public static Double Air(Double side1 ,Double side2){
        return (side1 * side2)/2;
    }
}

