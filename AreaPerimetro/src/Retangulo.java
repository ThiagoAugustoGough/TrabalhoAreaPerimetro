public class Retangulo {
    double base;
    double altura;

    public void calcularArea(){
        System.out.println("A area do Retangulo eh : " + this.base * this.altura);
    }

    public void calcularPerimetro(){
        System.out.println("O perimetro do retangulo eh : " + ((this.base * 2) + (this.altura * 2)));
    }
}
