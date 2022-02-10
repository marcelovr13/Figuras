public class Main {
    public static void main(String[] args) {

        Punto puntoRectangulo = new Punto(4,3);
        Punto puntoRectangulo2 = new Punto(9,6);
        Punto puntoCirculo = new Punto(7,2);
        Punto puntoCirculo2 = new Punto(8,12);

        Rectangulo rectangulo = new Rectangulo(5, 6, puntoRectangulo);
        System.out.println("El area del rectangulo es de: " + rectangulo.area());

        Circulo circulo = new Circulo(5, puntoCirculo);
        System.out.println("El area del circulo es de: " + circulo.area());
        Circulo circulo2 = new Circulo(8, puntoCirculo2);


        System.out.println("El punto central del rectangulo es: ");
        rectangulo.centro();
        System.out.println("El punto central del circulo es: " );
        circulo.centro();
        System.out.println("La distancia entre el rectangulo y el circulo es de: " +  rectangulo.distancia(puntoRectangulo, puntoCirculo));


        if (circulo.solapa(puntoCirculo, puntoCirculo2,5,8)){
            System.out.println("Los circulos  se solapan");
        }else{
            System.out.println("Los circulos no se solapan");
        }

        if(rectangulo.solapa(puntoRectangulo, puntoRectangulo2)){
            System.out.println("Los rectangulos se solapan");
        }else{
            System.out.println("No se solapan");
        }





    }
}
