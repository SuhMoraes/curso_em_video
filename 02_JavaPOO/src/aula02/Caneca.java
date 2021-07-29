package aula02;

public class Caneca {
    // Atributos
    String modelo;
    String cor;
    String tamanho;
    int capArmazenamento;
    boolean estaCheia;
    boolean tomarLiqQuentes;
    boolean usaReceita ;

    // Status do objeto
    void status(){                  // this -> faz referência ao objeto
        System.out.println("Uso: " + this.modelo);
        System.out.println("Caneca " + this.cor);
        System.out.println("Caneca tem " + this.capArmazenamento + " ml");
        System.out.println("Caneca está cheia ? " + this.estaCheia);
        System.out.println(" ");
    }


// Métodos - void(sem retorno)
    void liqQuente(){
        if(this.tomarLiqQuentes == true){
            System.out.println("O Café ou Chá está quente!");
        } else {
            System.out.println("A caneca está vazia!");
        }

    }

    void  medidaReceita() {
        if (this.usaReceita == false){
            System.out.println("Não usei a medida da caneca na receita, fiz a olho.");
       } else {
            System.out.println("Utilizei a caneca para medir.");
        }
    }

    void  encher(){
        this.estaCheia = true;

    }

    void esvaziar(){
        this.estaCheia = false;

    }
}
