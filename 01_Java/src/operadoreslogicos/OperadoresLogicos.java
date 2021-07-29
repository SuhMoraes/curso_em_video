package operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z = 10;
        boolean r;

        r = (x<y && y==z)?true:false;
        System.out.println(r);

        r = (x<y || y==z)?true:false;
        System.out.println(r);

        r = (x>y ^ y==z)?true:false;
        System.out.println(r);

        r = (x<y)!= (y<z)?true:false;
        System.out.println(r);

    }
}
