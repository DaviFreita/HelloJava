public class Debug {
    public static void main(String[] args) {
        int x = 2;
        int y = x + 5;

        while( y < 15){
            System.out.println(y);
            y+=x;
        }
    }
}
