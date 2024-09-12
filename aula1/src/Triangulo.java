import java.util.Scanner;

public class Triangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static Triangulo criarTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura do triângulo: ");
        double altura = sc.nextDouble();
        return new Triangulo(base, altura);
    }
}
