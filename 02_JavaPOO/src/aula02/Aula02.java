package aula02;

public class Aula02 {
    public static void main(String[] args) {

        // Instaciando um objeto
        Caneca caneca1 = new Caneca();

        // Referência a atributo
        caneca1.modelo = "Caneca de café";
        caneca1.cor = "Branco e Vermelha";
        caneca1.capArmazenamento = 220;
        caneca1.tamanho = "Média";
        caneca1.tomarLiqQuentes = true;
        caneca1.usaReceita = true;
        caneca1.estaCheia = true;

        // Referência a método
        caneca1.status();
        caneca1.liqQuente();
        caneca1.medidaReceita();

        Caneca caneca2 = new Caneca();
        caneca2.modelo = "Caneca de chá";
        caneca2.cor = "Azul e Amarelo";
        caneca2.capArmazenamento = 80;
        caneca2.tamanho = "Pequena";
        caneca2.tomarLiqQuentes = false;
        caneca2.usaReceita = false;
        caneca2.estaCheia = false;

        caneca2.status();
        caneca2.liqQuente();
        caneca2.medidaReceita();



    }
}
