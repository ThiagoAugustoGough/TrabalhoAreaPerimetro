public class Quadrado {

    double lado;

    public void calcularArea(){
        System.out.println("A area do quadrado eh : " + Math.pow(this.lado, 2));
    }

    public void calcularPerimetro(){
        System.out.println("O perimetro do quadrado eh : " + this.lado * 4);
    }
}
