public class Circulo {

    private final Punto punto;
    private final int radio;

    public Circulo(int radio, Punto punto) {
        this.punto = punto;
        this.radio = radio;
    }

    public double area(){       //Metodo que calcula el area del circulo
        return (Math.PI * (radio * radio));
    }

    public void centro(){
        int x = punto.getX();
        int y = punto.getY();
        System.out.println("("+ x + "," + y + ")");
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "punto=" + punto +
                ", radio=" + radio +
                '}';
    }
}
