package votoobrigatorio;

import java.util.Scanner;

public class VotoObrigatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você tem idade para Votar?");
        System.out.println("Digite o ano atual: ");
        int ano = sc.nextInt();

        System.out.println("Digite a sua data de Nascimento: ");
        int nasc = sc.nextInt();
        int i = ano - nasc;

        if(i <16){
            System.out.println(i + " anos");
            System.out.println("Não vota!");
        } else if(i>=16 && i > 70){
            System.out.println(i + " anos");
            System.out.println("Voto opcional");
        }else{
            System.out.println(i + " anos");
            System.out.println("Voto obrigatório");
        }


    }
}
