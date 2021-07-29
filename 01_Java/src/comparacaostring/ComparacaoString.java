package comparacaostring;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Suhailah";
        String nome2 = "Suhailah";
        String nome3 = new String("Suhailah");
        String result;
        result = (nome1==nome2)?"Igual":"Diferente";
        System.out.println(result);

        result = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(result);

        result = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(result);

    }
}
