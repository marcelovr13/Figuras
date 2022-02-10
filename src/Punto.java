public class Punto {

    private final int x;
    public int getX() {
        return x;
    }

    private final int y;
    public int getY() {
        return y;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto: " + "("+ x +"," + y + ")";
    }
}
