package Circle;
public class CircleRunner {
    public static void main(String[] args) {
        Circle o = new Circle(5);
        System.out.println(o.getInfo());
        o.setRadius(9.2);
        System.out.println(o.getInfo());
    }
}
