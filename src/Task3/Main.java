package Task3;

public class Main {
    public static void main(String[] args) {
        System.out.print("This is perimeter of TRIANGLE: ");
        Figure Tri = new Figure(
                new Point(1, 2, "A"),
                new Point(2, 3, "B"),
                new Point(3, 4, "C"));
        System.out.print("This is perimeter of SQUARE: ");
        Figure Quad = new Figure(
                new Point(1, 2, "A"),
                new Point(2, 3, "B"),
                new Point(3, 4, "C"),
                new Point(4, 5, "D"));
        System.out.print("This is perimeter of PENTAGON: ");
        Figure Pent = new Figure(
                new Point(1, 2, "A"),
                new Point(2, 3, "B"),
                new Point(3, 4, "C"),
                new Point(4, 5, "D"),
                new Point(5, 6, "E"));

    }
}
