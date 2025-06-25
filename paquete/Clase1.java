package paquete;

public class Clase1 {
    public int x;
    private int y;
    protected int z;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

}
