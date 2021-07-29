package operadorternario;

public class OperadorTernario {
    public static void main(String[] args) {
        int result, n1, n2;
        n1 = 50;
        n2 = 20;
        result = (n1 > n2) ? n1+n2:n1-n2;
        System.out.println(result);
    }
}
