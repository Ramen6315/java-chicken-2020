package domain;

import java.util.List;

public class Tables {
    private List<Table> tables;

    public Tables() {
        this.tables = TableRepository.tables();
    }
}
