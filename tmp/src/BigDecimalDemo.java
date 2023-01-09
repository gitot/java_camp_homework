import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal divide = BigDecimal.valueOf(5).divide(BigDecimal.valueOf(11), 5, RoundingMode.UP);
        System.out.println(divide);

    }
}
