package vetor;

import java.util.Arrays;

public class PreenchendoOVetor {
    public static void main(String[] args) {
        int vet[] = new int[20]; // Criação de um \Vetor com 20 posições
        Arrays.fill(vet, 0);
        for(int valor: vet){
            System.out.print(valor + " ");
        }
    }
}
