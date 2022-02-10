public class Main {
    public static void main(String[] args) {

        Punto puntoRectangulo = new Punto(4,3);
        Punto puntoCirculo = new Punto(7,2);

        Rectangulo rectangulo = new Rectangulo(5, 6, puntoRectangulo);
        System.out.println("El area del rectangulo es de: " + rectangulo.area());

        Circulo circulo = new Circulo(5, puntoCirculo);
        System.out.println("El area del circulo es de: " + circulo.area());

        System.out.println("El punto central del rectangulo es: ");
        rectangulo.centro();
        System.out.println("El punto central del circulo es: " );
        circulo.centro();

        System.out.println("La distancia entre el rectangulo y el circulo es de: " +  rectangulo.distancia(puntoRectangulo, puntoCirculo));



    }
}
