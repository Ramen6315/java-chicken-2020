package domain.chickenhouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Table {
    private static final int NONE_ORDER = 0;
    private static final int MAX_MENU_AMOUNT = 99;
    private static final int DISCOUNT_UNIT = 10;
    private final int number;
    private Map<Menu, Integer> menusInTable = new HashMap<>();

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
        if (!menusInTable.containsKey(menu)) {
            menusInTable.put(menu, menuAmount);
            return;
        }
        if (menusInTable.get(menu) + menuAmount > MAX_MENU_AMOUNT) {
            throw new IllegalArgumentException("총 수량이 99초과하였습니");
        }

        menusInTable.put(menu, menusInTable.get(menu) + menuAmount);
        System.out.println(menusInTable.size());

    }

    public boolean size() {
        return menusInTable.size() > NONE_ORDER;
    }

    public int calculateCreditCard() {
        int bill;
        int amount = 0;
        int result = 0;
        for (Menu menu : menusInTable.keySet()) {
            bill = menusInTable.get(menu) * menu.getPrice();
            amount += menusInTable.get(menu);
            result += bill - (10000 * amount / DISCOUNT_UNIT);
        }

        return result;
    }
}
