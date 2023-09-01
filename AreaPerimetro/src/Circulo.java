public class Circulo {

    double raio;

    public void calcularArea(){
        double area = Math.pow(this.raio, 2) * Math.PI;
        System.out.println("A area do cirulo eh : " + area);
    }

    public void calcularPerimetro(){
        double cirumferencia = (this.raio * 2) * Math.PI;
        System.out.println("A circumferencia do circulo eh : " + cirumferencia);

    }
}
