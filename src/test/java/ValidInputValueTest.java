import domain.validation.ValidInputValue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidInputValueTest {
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

    @Test
    @DisplayName("테이블 번호가 정수가 아닐 경우 익셉션이 발생한다")
    void tableValueTest() {
        String tableValue = "a";
        Assertions.assertThatThrownBy(() -> ValidInputValue.checkTableValue(tableValue));
    }

    @Test
    @DisplayName("테이블 번호가 1,2,3,4,5,6,8번이 아닐 경우 익셉션이 발생한다")
    void tableNumberTest() {
        String tableValue = "7";
        Assertions.assertThatThrownBy(() -> ValidInputValue.checkTableValue(tableValue));
    }
}
