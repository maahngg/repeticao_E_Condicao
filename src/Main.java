import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Insira o valor para o cálculo da tabuada: ");
        valor = scan.nextInt();

        for (int cont = 1; cont <= 10; cont++) {
            int multiplicacao = valor * cont;
            System.out.println(valor + " X " + cont + " = " + multiplicacao);

        }

        }
    }