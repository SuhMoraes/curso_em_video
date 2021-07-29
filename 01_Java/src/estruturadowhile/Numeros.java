package estruturadowhile;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int n, s =0;
        String resp;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            s += n;
            System.out.print("Quer continutar? [S/N] ");
            resp = sc.next();
        } while (resp.equals("S"));
        System.out.print("A soma de todos os valores é " + s);


    }
}
