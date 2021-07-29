package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;



    // Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus(true));
    }

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.isStatus(false);
    }

    public boolean isStatus(boolean status) {
        return status = status;  // -- Abriu a conta o status é false
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos Especiais
    public void abrirConta(String tipo){

        // Pegando e declarado os valores de:
        this.setTipo(tipo);
        this.isStatus(true);

        //Verificando o tipo da conta
        if(tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        // Verificando se há saldo está negativo
       if(this.getSaldo() > 0){
           System.out.println("Conta com dinheiro");
       } else if(this.getSaldo() < 0){
           System.out.println("Conta em débito");
       } else {
           this.setStatus(false);
       }
    }

    // Atribuindo o  método depositar a variável valor
    public void depositar(Double valor){ // --->
        // Verificando se há conta no banco
        if (this.isStatus(true) == true){
            //this.saldo = this.saldo + v
            this.setSaldo(this.getSaldo() + valor); //Alterando o valor com setSaldo, com a soma de saldo mais o valor depositado
            System.out.println("Depósito realizado com sucesso.");
            System.out.println("Depositado na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(Double valor){
        //
        if(this.isStatus(true)){
           if (this.getSaldo() >= valor){
               this.setSaldo(this.getSaldo() - valor);
               System.out.println("Saque realizado com sucesso.");
               System.out.println("Titular da conta : " + this.getDono() );
           }else{
               System.out.println("Saldo insuficiente");
           }
        }else{
            System.out.println("Impossível Sacar");
        }
    }

    public  void pagarMensal(){
        int valor = 0;
        if(this.getTipo() == "CC"){
            valor = 12;
        } else if (this.getTipo() == "CP"){
            valor = 20;
        }
        if (this.isStatus(true)){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta");
        }

    }
}
