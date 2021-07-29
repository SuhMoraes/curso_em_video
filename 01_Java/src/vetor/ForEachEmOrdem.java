package vetor;

import java.util.Arrays;

public class ForEachEmOrdem {
    public static void main(String[] args) {
        double v[] = {3.5, 5.5, 8.0, 3.0};

        Arrays.sort(v);

        for(double valor:v){
            System.out.println(valor + " ");
        }
    }
}
