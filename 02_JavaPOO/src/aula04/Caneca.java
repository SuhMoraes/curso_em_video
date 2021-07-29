package aula04;

///  Métodos Getter, Setter e Construtor
public class Caneca {
    public String modelo;
    private int capArmazenamento;
    private Boolean cheia;
    private String cor;


    // MÉTODO CONSTRUCT
    public Caneca(String modelo, int capArmazenamento,  String cor) { // Para identificar o método construct, é aquele que tem o mesmo nome da sua class
        this.modelo = modelo;
        this.capArmazenamento = capArmazenamento;
        this.cor = cor;
        this.estaCheia(); // --> Ao invés de colocar o Boolean, coloque o método onde o Boolean está declarad
    }


    public String getModelo(){
        return  this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public  int getCapArmazenamento(){
        return this.capArmazenamento;
    }

    public void setCapArmazenamento(int arm){
        this.capArmazenamento = arm;
    }

    public void estaCheia(){
        this.cheia = true;
    }

    public void estaVazia(){
        this.cheia = false;
    }

    public void status(){
        System.out.println("=== SOBRE CANECAS ===");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade de armazenamento: " + this.capArmazenamento + " ml");
        System.out.println("Está cheia: " + this.cheia);
        System.out.println("Cor: " + this.cor);

    }

}
