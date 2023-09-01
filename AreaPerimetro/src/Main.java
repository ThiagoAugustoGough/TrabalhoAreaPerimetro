// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Triangulo tri1 = new Triangulo();
        tri1.altura = 3;
        tri1.base = 8;
        tri1.calcularArea();
        tri1.calcularPerimetro();

        Circulo cir1 = new Circulo();
        cir1.raio = 5;
        cir1.calcularArea();
        cir1.calcularPerimetro();

        Quadrado quad1 = new Quadrado();
        quad1.lado = 5;
        quad1.calcularArea();
        quad1.calcularPerimetro();

        Retangulo ret1 = new Retangulo();
        ret1.base = 4;
        ret1.altura = 3;
        ret1.calcularArea();
        ret1.calcularPerimetro();
    }
    }
