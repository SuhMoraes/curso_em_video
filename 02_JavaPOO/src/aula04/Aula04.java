package aula04;


public class Aula04 {
    public static void main(String[] args) {
        Caneca c1 = new Caneca("Caneca Cappucino",200,"Branco e Azul");
        c1.status();
        Caneca c2 = new Caneca("Caneca para Café", 100, "Marrom");
        c2.estaVazia();
        c2.status();
    }
}
