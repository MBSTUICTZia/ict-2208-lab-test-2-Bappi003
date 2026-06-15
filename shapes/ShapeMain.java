package shapes;

public class ShapeMain {

    public static void main(String[] args) {

        Rectangle r =
                new Rectangle("Red", true, 4, 5);

        Circle c =
                new Circle("Blue", false, 3);

        System.out.println(r);
        System.out.println();

        System.out.println(c);
    }
}
