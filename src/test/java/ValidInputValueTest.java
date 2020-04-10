import domain.validation.ValidInputValue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidInputValueTest {
    @Test
    @DisplayName("원하는 기능 입력값이 정수가 아닐 경우 익셉션이 발생한다")
    void posMenuNotIntegerValueTest() {
        String posMenuValue = "a";
        Assertions.assertThatThrownBy(() -> ValidInputValue.checkMenuValue(posMenuValue));
    }
    @Test
    @DisplayName("원하는 기능 입력값이 정수이지만 1,2,3이 아닐경우 익셉션이 발생한다")
    void posMenuValueTest() {
        String posMenuValue = "4";
        Assertions.assertThatThrownBy(() -> ValidInputValue.checkMenuValue(posMenuValue));
    }
}
