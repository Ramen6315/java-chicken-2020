import domain.chickenhouse.Category;
import domain.chickenhouse.Menu;
import domain.chickenhouse.Table;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TableTest {
    @Test
    @DisplayName("선택한 테이블의 번호가 맞으면 True를 반환한다")
    void selectCorrectTableTest() {
        Table table = new Table(1);
        assertThat(table.isSameTable(1)).isTrue();
    }

    @Test
    @DisplayName("선택한 테이블의 번호가 맞으면 True를 반환한다")
    void selectWrongTableTest() {
        Table table = new Table(2);
        assertThat(table.isSameTable(1)).isFalse();
    }

    @Test
    @DisplayName("카드 결제할 경우")
    void calculateCreditCardTest() {
        Table table = new Table(1);
        table.orderMenu(new Menu(1,"치킨", Category.CHICKEN, 16000),10);
        assertThat(table.calculateCreditCard()).isEqualTo(150000);
    }
}
