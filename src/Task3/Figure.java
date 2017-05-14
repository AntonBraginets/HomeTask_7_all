package Task3;

class Figure {
    public double lengthSide(Point A, Point B) {
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
    }

    public Figure(Point point1, Point point2, Point point3) {
        double AB = lengthSide(point1, point2);
        double BC = lengthSide(point2, point3);
        double AC = lengthSide(point1, point3);
        double Perimeter = AB + BC + AC;
        System.out.println(Perimeter);
    }

    public Figure(Point point1, Point point2, Point point3, Point point4) {
        double AB = lengthSide(point1, point2);
        double BC = lengthSide(point2, point3);
        double CD = lengthSide(point3, point4);
        double AD = lengthSide(point1, point4);
        double Perimeter = AB + BC + CD + AD;
        System.out.println(Perimeter);
    }

    public Figure(Point point1, Point point2, Point point3, Point point4, Point point5) {
        double AB = lengthSide(point1, point2);
        double BC = lengthSide(point2, point3);
        double CD = lengthSide(point3, point4);
        double DE = lengthSide(point4, point5);
        double AE = lengthSide(point1, point5);
        double Perimeter = AB + BC + CD + DE + AE;
        System.out.println(Perimeter);
    }

}
