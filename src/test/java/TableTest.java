import domain.Table;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TableTest {
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
}
