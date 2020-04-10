package domain;

import java.util.List;

public class Table {
    private final int number;
    private List<Menu> menus = MenuRepository.menus();

    public Table(final int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public boolean isSameTable(int tableNumber) {
        return tableNumber == number;
    }
}
