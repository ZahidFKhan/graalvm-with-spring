import java.math.BigDecimal;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        final var bigDecimal = new BigDecimal("122222222222222222222");

        System.out.println("Hello world");
        Thread.currentThread().wait(10000);
    }
}
