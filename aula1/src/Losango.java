import java.util.Scanner;

public class Losango implements AreaCalculavel {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public static Losango criarLosango() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da diagonal maior do losango: ");
        double diagonalMaior = sc.nextDouble();
        System.out.print("Informe o valor da diagonal menor do losango: ");
        double diagonalMenor = sc.nextDouble();
        return new Losango(diagonalMaior, diagonalMenor);
    }
}
