public class LoopFor {
    public static void main(String[] args) {

        //primeira forma, tradicional
        //começo;final;incremento
        for( int i = 0; i < 10; i++ ){
            System.out.println(i);
        }

        //Aqui será se for usar mais de uma variavel em fo
        int m = 10;

        for(int l = 0;  m < 20; l++ ){
            System.out.println(" l = "+ l +"   m = "+ m);
            m++;
        }
    }
}
