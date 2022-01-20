import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

public class ParametersTest {

    @Test
    public void lambdaLabelsTest() {
        Allure.parameter("Регион", "Москва");
        Allure.parameter("Область", "Московская");
    }

}
