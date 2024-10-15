package RightTriangle;
public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle o = new RightTriangle(3, 4);
        RightTriangle j = new RightTriangle(6.5, 10.7);
        System.out.println(o.findHypotenuse());
        System.out.println(j.findHypotenuse());
    }
}
