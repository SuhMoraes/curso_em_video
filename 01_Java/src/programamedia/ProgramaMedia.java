package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua nota de Português: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a sua nota de Matemática: ");
        double n2 = sc.nextDouble();
        double m = (n1 + n2) / 2;

        System.out.println("Sua média foi " + m);
        if(m>=9){
            System.out.print("Parabéns, você está mais que qualificado");
        }
        sc.close();
    }
}
