import domain.chickenhouse.Category;
import domain.chickenhouse.Menu;
import domain.chickenhouse.Menus;
import domain.validation.ValidInputValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MenuTest {

    @Test
    @DisplayName("정수 이외의 값이 입력될경우 익셉션을 발생한다")
    void notIntegerMenuValueTest() {
        String input = "a";
        Menus menus = new Menus();
        assertThatThrownBy(() -> ValidInputValue.checkMenuValue(input, menus));
    }

    @Test
    @DisplayName("메뉴 번호 이외의 정수값이 입력될경우 익셉션을 발생한다")
    void notCorrectIntegerMenuValueTest() {
        String input = "40";
        Menus menus = new Menus();
        assertThatThrownBy(() -> ValidInputValue.checkMenuValue(input, menus));
    }

    @Test
    @DisplayName("등록할 메뉴가 있을경우")
    void seletMenuTest() {
        Menus menus = new Menus();
        Menu menu = new Menu(1, "후라이", Category.CHICKEN, 16000);
        assertThat(menus.selectMenu(1)).isEqualTo(menu);
    }

    @Test
    @DisplayName("등록할 메뉴가 없을경우 익셉션을 발생한다")
    void selectNoneMenuNumberTest() {
        Menus menus = new Menus();
        Menu menu = new Menu(2, "test", Category.CHICKEN, 150000);
        assertThatThrownBy(() -> menus.selectMenu(33));
    }

    @Test
    @DisplayName("등록할 메뉴가 다를경우 ")
    void selectWrongMenuNumberTest() {
        Menus menus = new Menus();
        Menu menu = new Menu(2, "test", Category.CHICKEN, 150000);
        assertThat(menus.selectMenu(3)).isNotEqualTo(menu);
    }
}
