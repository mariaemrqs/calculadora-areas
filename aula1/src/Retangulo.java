import java.util.Scanner;

public class Retangulo implements AreaCalculavel {
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    public static Retangulo criarRetangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da altura do retangulo: ");
        double altura = sc.nextDouble();
        System.out.println("Informe o valor da largura do retangulo: ");
        double largura = sc.nextDouble();
        return new Retangulo(altura, largura);
    }
}