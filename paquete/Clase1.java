package paquete;

public class Clase1 {
    int w;
    public int x;
    public int y;

    protected int z;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    void restW(){
        this.w -= 20;
    }

    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
    

}