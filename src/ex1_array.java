public class ex1_array {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};


        // ORDEM NORMAL DO VETOR
        int cont=0;
        System.out.print("Vetor na ordem padrão: ");
        while(cont <= (vetor.length - 1)){
            System.out.print   (vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nVetor na ordem inversa: ");
        // ORDEM INVERSA DO VETOR
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }

    }
}
