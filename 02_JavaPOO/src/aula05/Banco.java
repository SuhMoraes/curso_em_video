package aula05;

public class Banco {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco(001,  "Joaquim");


        ContaBanco cliente2 = new ContaBanco(002, "Fernanda");
        cliente2.sacar(1000.0);





        cliente1.estadoAtual();
        cliente2.estadoAtual();
    }
}
