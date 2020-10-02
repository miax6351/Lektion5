package OO_6;

class main {
    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        if (p1.equals(p2));

        p1.move(1,2);
        System.out.println(p1);
        p2.move(2,2);
        System.out.println(p2);

        if (p1.equals(p2));


    }

}


public class Point {

    private int x;
    private int y;
    private int d = 0;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("("+x+","+y+")");
    }

    public boolean equals(Point other) {
        if (this.x == other.x && this.y == other.y) {
            System.out.println("Samme punkt");
            return true;
        }
        else {
            System.out.println("ikke samme punkt");
        return false;
    }}

    public void move(int dx, int dy){
        this.x = dx + this.x;
        this.y = dy + this.y;
    }


}

