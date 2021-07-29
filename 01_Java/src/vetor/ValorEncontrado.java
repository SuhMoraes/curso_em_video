package vetor;

import java.util.Arrays;

public class ValorEncontrado {
    public static void main(String[] args) {
        int vet[] = {3, 5, 8, 2};
        for( int v:vet){
            System.out.print(v + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet,2);

            System.out.println("Encontrei o valor na posição " + p);

    }
}
