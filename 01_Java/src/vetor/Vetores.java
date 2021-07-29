package vetor;

public class Vetores {
    public static void main(String[] args) {
        int n[] = {2, 5, 8, 9, 10, 15};
        System.out.println("Total de casas de N " + n.length);

        for(int i = 0; i<=n.length-1; i++){
            System.out.println("Na posicação "+ i + " temos o valor " + n[i]);
        }
    }
}
