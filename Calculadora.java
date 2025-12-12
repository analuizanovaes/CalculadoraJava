import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------CALCULADORA RÁPIDA------");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Não existe divisão por zero!");
                    sc.close(); 
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close(); 
                return;
        }

        if (resultado % 1 == 0) {
            System.out.printf("Resultado: %.0f%n", resultado); 
        } else {
            System.out.printf("Resultado: %.2f%n", resultado);
        }

        sc.close();
    }
}