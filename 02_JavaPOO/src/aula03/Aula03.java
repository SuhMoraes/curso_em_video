package aula03;



public class Aula03 {
    public static void main(String[] args) {

        Caneca caneca1 = new Caneca();

        caneca1.modelo = "Caneca de café";
        caneca1.cor = "Branco e Vermelha";
        // caneca1.capArmazenamento = 220; ----> Método Privado
        caneca1.tamanho = "Média";
        caneca1.tomarLiqQuentes = true;
        caneca1.usaReceita = true;
        //caneca1.estaCheia = true; ----> Método Privado

        caneca1.status();
        caneca1.liqQuente();
       caneca1.medidaReceita();
        Caneca caneca2 = new Caneca();
        caneca2.modelo = "Caneca de chá";
        caneca2.cor = "Azul e Amarelo";
       // caneca2.capArmazenamento = 80; ----> Método Privado
        caneca2.tamanho = "Pequena";
        caneca2.tomarLiqQuentes = false;
        caneca2.usaReceita = false;
       // caneca2.estaCheia = false;

        caneca2.status();
        caneca2.liqQuente();
       caneca2.medidaReceita();



    }
}
