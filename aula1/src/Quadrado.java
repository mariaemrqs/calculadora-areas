import java.util.Scanner;

public class Quadrado implements AreaCalculavel {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public static Quadrado criarQuadrado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = sc.nextDouble();
        return new Quadrado(lado);
    }
}
