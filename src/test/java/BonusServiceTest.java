import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.BonusService;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // здесь проводим проверку (сравниваем ожидаемый и фактический результаты)
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // здесь проводим проверку (сравниваем ожидаемый и фактический результаты)
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 10_000;
        boolean registered = false;
        long expected = 100;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // здесь проводим проверку (сравниваем ожидаемый и фактический результаты)
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 100_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // здесь проводим проверку (сравниваем ожидаемый и фактический результаты)
        Assertions.assertEquals(expected, actual);

    }

}
