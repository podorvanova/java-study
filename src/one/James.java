package one;

public class James {
    public static void main(String[] args) {
        System.out.println("Я управляю");
        System.out.println("миром");
        int x = 4;
        while (x > 3) {
            // Комментарий
            System.out.println(x);
            x = x - 1;
        }
        int z = 27;
        while (z == 17) {
            // Код цикла не будет запущен, так как z не равно 17
        }
    }
}