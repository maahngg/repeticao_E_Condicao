import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor para calcular o fatorial:");
        int valor = leitor.nextInt();
        int multiplicacao = 1;

        System.out.print(valor + "! = ");
        for(int i = valor; i >= 1 ; i-- ){
            multiplicacao =multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
