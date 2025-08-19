import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        double soma = 0;
        int n = 1;

        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua "+ n +"º nota: ");

            String line = scanner.nextLine();

            if(line.equals("")){
                System.out.println("Media: "+ soma/(n-1));
                break;
            }

            soma += Double.parseDouble(line);
            n++;
        }
    }
}
