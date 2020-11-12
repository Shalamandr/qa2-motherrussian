import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MyFirstTest {
    Integer age = 18;
    BigDecimal price = new BigDecimal("10.01");
    private int globalWar = 10;

    @Test
    public void firsTest() {
        System.out.println("Hello, corona, matha fucka!");
        int sum = sumBodyOnceToldMy(15, 20);
        System.out.println("Aaaaand the sum is: " + sum + " years old is about to experience infinity");
        System.out.println(sumBodyOnceToldMy(3, 8));
            age = 19;
    }

    private int sumBodyOnceToldMy(int a, int b) {
        int c = a + b;
        return c;

    }
}


