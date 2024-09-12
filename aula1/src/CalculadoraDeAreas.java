import java.util.Scanner;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculavel figura = null;

        while (true) {
            System.out.println("\n--- Menu de Figuras Geométricas ---");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Losango");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    figura = Quadrado.criarQuadrado();
                    break;
                case 2:
                    figura = Retangulo.criarRetangulo();
                    break;
                case 3:
                    figura = Triangulo.criarTriangulo();
                    break;
                case 4:
                    figura = Losango.criarLosango();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            if (figura != null) {
                double area = figura.calcularArea();
                System.out.println("A área da figura escolhida é: " + area);
            }
        }
    }
}
