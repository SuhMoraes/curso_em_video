package switchbreak;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pernas? ");
        int perna = sc.nextInt();
        String tipo;

        System.out.println("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2 :
                tipo = " Bípedes";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";

        }
        System.out.println(tipo);
    }
}
