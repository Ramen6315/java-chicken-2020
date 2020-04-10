package view;

import domain.Menu;
import domain.Menus;
import domain.Table;
import domain.Tables;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String SELECT_POS_VALUE = "##메인 화면 \n 1 - 주문등록\n 2 - 결제하기\n 3 - 프로그램 종료\n";
    private static final String INPUT_POS_VALUE = "## 원하는 기능을 선택하세요";

    public static void printTables(final Tables tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.tableSize();
        printLine(TOP_LINE, size);
        printTableNumbers(tables.getTables());
        printLine(BOTTOM_LINE, size);
    }

    public static void printMenus(final Menus menus) {
        for (final Menu menu : menus.getMenus()) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printPosMenu() {
        System.out.println(SELECT_POS_VALUE);
    }

    public static void printSelectPosValue() {
        System.out.println(INPUT_POS_VALUE);
    }

    public static void printSelectMenu() {
        System.out.println("## 등록할 메뉴를 선택하세요");
    }

    public static void printMenuAmount() {
        System.out.println("## 수량을 입력해주세요");
    }
}
