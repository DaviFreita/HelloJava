public class SomadePares {
    public static void main(String[] args) {
        int cont = 0;

        for( int i = 0 ; i <= 100 ; i++) {
            cont = i % 2 == 0 ? cont + i : cont;
        }

        System.out.println("Soma de Pares: "+cont);

        int cont2 = 0;

        for(int i = 0 ; i <= 100 ; i++){
            cont2 = i % 2 != 0 ? cont2 + i :cont2;
        }

        System.out.println("Soma de Impares: "+cont2);
    }
}
