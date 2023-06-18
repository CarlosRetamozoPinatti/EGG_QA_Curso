package Service;

import Entity.Figura;

import java.util.Scanner;

public class FiguraService {
    Scanner leer = new Scanner(System.in);
    Figura fig = new Figura();
    //Crear Figura generica
    public Figura crearFigura(){
        return fig;
    }

    //CUADRADO
    public Figura crearCuadrado(){
        System.out.println("Ingrese el valor del lado del cuadrado.");
        fig.setValor1(leer.nextDouble());
        return fig;
    }
    public void areaCuadrado(Figura fig){
        System.out.println("El area del cuadrado sera: " + Math.pow(fig.getValor1(), 2));
    }
    public void perimCuadrado(Figura fig){
        System.out.println("El perimetro del cuadrado sera: " + (fig.getValor1() * 4));
    }

    //RECTANGULO
    public Figura crearRectangulo(){
        System.out.println("Ingrese el valor de la base del rectangulo: ");
        fig.setValor1(leer.nextDouble());
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        fig.setValor2(leer.nextDouble());
        return fig;
    }
    public void areaRectangulo(Figura fig){
        System.out.println("El area del rectangulo es: " + ((fig.getValor1() * fig.getValor2())) );
    }
    public void perimRectangulo(Figura fig){
        System.out.println("El perimetro del rectangulo es: " + ((fig.getValor1() * 2) + (fig.getValor2() * 2)) );
    }

    //TRIANGULO
    public Figura crearTriangulo(){
        System.out.println("Ingrese el valor del lado 1 del triangulo: ");
        fig.setValor1(leer.nextDouble());
        System.out.println("Ingrese el valor del lado 2 del triangulo: ");
        fig.setValor2(leer.nextDouble());
        System.out.println("Ingrese el valor del lado 3 del triangulo: ");
        fig.setValor3(leer.nextDouble());

        return fig;
    }
    public void perimTriangulo(Figura fig){
        System.out.println("El perimetro del triangulo es: " + (fig.getValor1() + fig.getValor2() + fig.getValor3()) );
    }
    public void areaTriangulo(Figura fig){
        System.out.println("Ingrese el valor de la altura del triangulo: ");
        fig.setValor1(leer.nextDouble());
        System.out.println("Ingrese el valor de la base del triangulo: ");
        fig.setValor2(leer.nextDouble());
        System.out.println("El area del triangulo es: " + ((fig.getValor1() * fig.getValor2()) / 2) );
    }

    //CIRCULO
    public Figura crearCirculo(){
        System.out.println("Ingrese el valor del radio del circulo: ");
        fig.setValor1(leer.nextDouble());

        return fig;
    }
    public void areaCirculo(Figura fig){
        System.out.println("El area del circulo es: " + (Math.pow(fig.getValor1(), 2) * Math.PI) );
    }
    public void perimCirculo(Figura fig){
        System.out.println("El perimetro del circulo es: " + (Math.PI * 2 * fig.getValor1()));
    }

    //HEXAGONO
    public Figura crearHexagono(){
        System.out.println("Ingrese el valor de lado del hexagono: ");
        fig.setValor1(leer.nextDouble());
        fig.setValor2((Math.sqrt(3) * fig.getValor1()) / 2); //APOTEMA - NECESARIO PARA EL CALCULO DE AREA
        System.out.println("De acuerdo al lado " + fig.getValor1());
        System.out.println("El apotema del hexagono es " + fig.getValor2());

        return fig;
    }
    public void perimHexagono(Figura fig){
        System.out.println("El perimetro del hexagono es: " + (6 * fig.getValor1()) );
    }
    public void areaHexagono(Figura fig){
        System.out.println("El area del hexagono es: " + (3 * fig.getValor1() * fig.getValor2()) );
    }

    //PENTAGONO
    public Figura crearPentagono(){
        System.out.println("Ingrese el valor de lado del pentagono: ");
        fig.setValor1(leer.nextDouble());
        fig.setValor3(Math.tan(36));
        fig.setValor2(fig.getValor1() / (2 * fig.getValor3()));
        System.out.println("Segun el valor de lado " + fig.getValor1());
        System.out.println("El apotema del pentagono será: " + fig.getValor2());

        return fig;
    }
    public void perimPentagono(Figura fig){
        System.out.println("El perimetro del pentagono es: " + (5 * fig.getValor1()) );
    }
    public void areaPentagono(Figura fig){
        System.out.println("El area del pentagono es: " + ((5 * fig.getValor1() * fig.getValor2()) / 2) );
    }

    //ROMBO
    public Figura crearRombo(){
        System.out.println("Ingrese el valor de lado del rombo: ");
        fig.setValor1(leer.nextDouble());
        System.out.println("Ingrese el valor de la Diagonal mayor: ");
        fig.setValor2(leer.nextDouble());
        System.out.println("Ingrese el valor de la Diagonal menor: ");
        fig.setValor3(leer.nextDouble());

        return fig;
    }
    public void perimRombo(Figura fig){
        System.out.println("El perimetro del rombo es: " + (fig.getValor1() * 4) );
    }
    public void areaRombo(Figura fig){
        System.out.println("El area del rombo es: " +((fig.getValor2() * fig.getValor3()) / 2) );
    }


}
