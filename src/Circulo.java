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

    public boolean solapa(Punto puntoC1, Punto puntoC2, int radio1, int radio2){
        double paso1 = ((puntoC1.getX() * puntoC1.getX() - puntoC1.getY() * puntoC1.getY()) + (puntoC2.getX() * puntoC2.getX() - puntoC2.getY() * puntoC2.getY()));
        double resultado = Math.sqrt(paso1);
        double sumaRadios = radio1 + radio2;
        if (resultado < sumaRadios){
            return true;
        }else
            return false;

    }

    public double distancia(Punto puntoR, Punto puntoC){
        double resultado = ((puntoR.getX() * puntoR.getX() - puntoR.getY() * puntoR.getY()) + (puntoC.getX() * puntoC.getX() - puntoC.getY() * puntoC.getY()));
        return Math.sqrt(resultado);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "punto=" + punto +
                ", radio=" + radio +
                '}';
    }
}
