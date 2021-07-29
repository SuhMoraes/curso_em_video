package estruturafor;

public class LacosAninhados {
    public static void main(String[] args) {
        for (int i = 0; i<=3; i++){
            for(int j=0; j<=2; j++){
                System.out.println("1° Laço " + j);
            }
            System.out.println("2°Segundo laço " + i);

        }
    }
}
