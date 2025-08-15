public class ContinueInJava {
    public static void main(String[] args) {
        int i = 19;

        do{
            System.out.println("Inicio da função");

            if( i > 18){
                System.out.println("Continua a função normalmente (continue)");
                continue;
            }

            System.out.println("Ele é ao contrario da função break");
            System.out.println("A condição n foi verdadeiro, entao encerra o loop");
            System.out.println("verfificar a condição");

        }while(true);
        //true no while vai ser sempre verdadeiro, ou seja um loop infinito;
    }
}