import java.sql.SQLOutput;

public class Triangulo {
    int base;
    int altura;
    public void calcularPerimetro(){
         double hipotenusa = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
         double areaTotal = hipotenusa + this.base + this.altura;
         System.out.println("O perimetro do triangulo eh: " + areaTotal);
    }

    public void calcularArea() {
        int area = (this.base * this.altura) / 2;
        System.out.println("A area do triangulo eh: " + area);
    }
}
