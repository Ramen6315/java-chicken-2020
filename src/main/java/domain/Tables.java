package domain;

import java.util.List;

public class Tables {
    private List<Table> tables;

    public Tables() {
        this.tables = TableRepository.tables();
    }

    public Table chooseTable(int tableNumber) {
        return tables.stream()
                .filter(table -> table.isSameTable(tableNumber))
                .findAny()
                .orElseThrow(IllegalAccessError::new);
    }
}
