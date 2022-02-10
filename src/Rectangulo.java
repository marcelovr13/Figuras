public class Rectangulo {

    private final Punto punto;
    private final int base;
    private final int altura;

    public Rectangulo(int base, int altura, Punto punto) {  //Constructor de la clase Rectangulo para inicializar objetos.
        this.punto = punto;
        this.base = base;
        this.altura = altura;
    }

    public double area(){        //Metodo que calcula el area del rectangulo
        return (base * altura);
    }

    public void centro(){
        int x = punto.getX();
        int y = punto.getY();
        System.out.println("("+ x + "," + y + ")");
    }

    public double distancia(Punto puntoR, Punto puntoC){
        double resultado = ((puntoR.getX() * puntoR.getX() - puntoR.getY() * puntoR.getY()) + (puntoC.getX() * puntoC.getX() - puntoC.getY() * puntoC.getY()));
        return Math.sqrt(resultado);
    }

    public boolean solapa(Punto R1, Punto R2){

        if((R1.getX() < R2.getX() && R2.getX() > R1.getX()) && (R1.getY() < R2.getY() && R2.getY() > R1.getY())){
            return true;
        }else{
            return false;
        }

        }




    @Override
    public String toString() {
        return "Rectangulo{" +
                "punto=" + punto +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
