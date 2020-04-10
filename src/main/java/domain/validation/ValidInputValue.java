package domain.validation;

import domain.chickenhouse.Menu;
import domain.chickenhouse.Menus;

public class ValidInputValue {
    private static final int MIN_POS_MENU_VALUE = 1;
    private static final int MAX_POS_MENU_VALUE = 3;
    private static final String WRONG_TABLE_NUMBER_MESSAGE = "테이블 번호는 1,2,3,4,5,6,8번 만 가능합니다";
    private static final String WRONG_POS_NUMBER_MESSAGE = "포스 메뉴는 1,2,3번중 하나 이어야 합니다.";
    private static final int MAX_MENU_AMOUNT = 99;

    public static int checkPosMenuValue(String posMenuValue) {
        int posMenuNumber;
        try {
            posMenuNumber = checkMenuValueRange(posMenuValue);
        } catch (Exception e) {
            throw new IllegalArgumentException(WRONG_POS_NUMBER_MESSAGE);
        }
        return posMenuNumber;
    }

    private static int checkMenuValueRange(String posMenuValue) {
        int posMenuNumber = Integer.parseInt(posMenuValue);
        if (posMenuNumber < MIN_POS_MENU_VALUE || posMenuNumber > MAX_POS_MENU_VALUE) {
            throw new IllegalArgumentException();
        }
        return posMenuNumber;
    }

    public static int checkTableValue(String tableValue) {
        int tableNumber;
        try {
            tableNumber = checkTableValueRange(tableValue);
        } catch (Exception e) {
            throw new IllegalArgumentException(WRONG_TABLE_NUMBER_MESSAGE);
        }
        return tableNumber;
    }

    private static int checkTableValueRange(String tableValue) {
        int tableNumber = Integer.parseInt(tableValue);
        if (tableNumber == 7 || (tableNumber < 1 || tableNumber > 8)) {
            throw new IllegalArgumentException("테이블 번호는 1,2,3,4,5,6,8번 만 가능합니다");
        }
        return tableNumber;
    }

    public static Menu checkMenuValue(String menuValue, Menus menus) {
        Menu menu;
        try {
            menu = checkMenuNumberRange(Integer.parseInt(menuValue), menus);
        } catch (Exception e) {
            throw new IllegalArgumentException("올바른 메뉴번호를 입력해주십시오");
        }
        return menu;
    }

    private static Menu checkMenuNumberRange(int menuNumber, Menus menus) {
        return menus.getMenus().stream()
                .filter(menu -> menu.isSameMenuNumber(menuNumber))
                .findAny()
                .orElseThrow(IllegalAccessError::new);
    }

    public static int checkMenuAmount(String menuAmountValue) {
        int menuAmount;
        try {
            menuAmount = checkOverAmount(Integer.parseInt(menuAmountValue));
        } catch (Exception e) {
            throw new IllegalArgumentException("올바른 메뉴 수량을 입력해주세요");
        }
        return menuAmount;
    }

    private static int checkOverAmount(int parseInt) {
        if (parseInt > MAX_MENU_AMOUNT) {
            throw new IllegalArgumentException();
        }
        return parseInt;
    }
}
