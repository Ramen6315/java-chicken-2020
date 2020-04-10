package domain;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public class Table {
    private final int number;
    private Map<Menu, Integer> menusInTable;

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
                Objects.equals(menusInTable, table.menusInTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, menusInTable);
    }

    public void orderMenu(Menu menu, int menuAmount) {
        if(menusInTable.get(menu) + menuAmount > 99) {
            throw new IllegalArgumentException("총합이 99를 넘습니다.다시 입력해주세요");
        }
        if(!menusInTable.containsKey(menu)) {
            menusInTable.put(menu, menuAmount);
        }

        menusInTable.put(menu, menusInTable.get(menu) + menuAmount);
    }
}
