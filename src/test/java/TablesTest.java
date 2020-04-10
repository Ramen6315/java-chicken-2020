import domain.chickenhouse.Table;
import domain.chickenhouse.Tables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TablesTest {
    @Test
    @DisplayName("입력 받은 테이블 번호가 선택된다")
    void chooseTablesTest() {
        Table table = new Table(1);
        Tables tables = new Tables();
        assertThat(tables.chooseTable(1)).isEqualTo(table);
    }
}
