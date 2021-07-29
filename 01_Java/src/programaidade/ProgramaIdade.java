package programaidade;

import java.util.Date;
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que ano você nasceu? ");
        int nasc = sc.nextInt();
        int i = 2021 - nasc;
        System.out.println("Sua idade é " + i + " anos");
        if(i>18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
