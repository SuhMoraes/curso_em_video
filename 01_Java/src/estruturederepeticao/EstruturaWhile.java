package estruturederepeticao;

public class EstruturaWhile {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if(cc == 5 ){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}
