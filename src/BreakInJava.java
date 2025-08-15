public class BreakInJava {
    public static void main(String[] args) {
        int i = 19;

        do{
            System.out.println("Inicio da função");

            if( i > 18){
                System.out.println("Função encerrada(break)");
                break;
            }
            System.out.println("A condição n foi verdadeiro, entao continua loop");
            System.out.println("verfificar a condição");
        }while(true);
        //true no while vai ser sempre verdadeiro, ou seja um loop infinito;
    }
}
