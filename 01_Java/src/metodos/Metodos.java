package metodos;

public class Metodos {
    // Procedimento que não retorna nada
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }

    public static void main(String[] args) {
        System.out.println("Começou o Programa");

        // Retorna o Procedimento acima.
        soma(5,2);
    }
}
