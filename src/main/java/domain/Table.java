package domain;

import java.util.List;
import java.util.Objects;

public class Table {
    private final int number;
    private List<Menu> menus = MenuRepository.menus();

    public Table(final int number) {
        this.number = number;
    }

    public boolean isSameTable(int tableNumber) {
        return tableNumber == number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return number == table.number &&
                Objects.equals(menus, table.menus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, menus);
    }
}
