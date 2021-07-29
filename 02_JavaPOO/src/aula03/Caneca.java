package aula03;

/// Configurando Visibilidade de Atributos e Métodos
public class Caneca {
    public String modelo;
    public String cor;
    public String tamanho;
    private int capArmazenamento;
    private boolean estaCheia;
    protected boolean tomarLiqQuentes;
    protected boolean usaReceita ;

    public void status(){
        System.out.println("Uso: " + this.modelo);
        System.out.println("Caneca " + this.cor);
        System.out.println("Caneca tem " + this.capArmazenamento + " ml");
        System.out.println("Caneca está cheia ? " + this.estaCheia);
        System.out.println(" ");
    }


    public void liqQuente(){
        if(this.tomarLiqQuentes == true){
            System.out.println("O Café ou Chá está quente!");
        } else {
            System.out.println("A caneca está vazia!");
        }

    }

    public void  medidaReceita() {
        if (this.usaReceita == false){
            System.out.println("Não usei a medida da caneca na receita, fiz a olho.");
       } else {
            System.out.println("Utilizei a caneca para medir.");
        }
    }

    private void  encher(){
        this.estaCheia = true;

    }

    protected void esvaziar(){
        this.estaCheia = false;

    }
}
