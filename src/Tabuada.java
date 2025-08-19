import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a tabuada que desejada");
        int i = scanner.nextInt();

        for(int j = 0; j <= 10; j++){
            System.out.println( i +" * "+ j + " = " +(i*j));
        }
    }
}