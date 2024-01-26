import java.util.Scanner;

public class SomarDoisNumeros {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza a soma de dois números inteiros.");

        // Solicita e recebe o primeiro número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Solicita e recebe o segundo número do usuário
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Calcula a soma dos dois números
        int resultadoSoma = primeiroNumero + segundoNumero;

        // Exibe o resultado para o usuário
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é: " + resultadoSoma);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
