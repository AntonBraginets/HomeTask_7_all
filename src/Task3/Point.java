package Task3;

class Point {
    int x = 0;
    int y = 0;
    String name = "null";

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
}