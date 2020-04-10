package domain.chickenhouse;

import domain.repository.TableRepository;

import java.util.Collections;
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

    public int tableSize() {
        return tables.size();
    }

    public List<Table> getTables() {
        return Collections.unmodifiableList(tables);
    }

}
