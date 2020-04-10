package domain.validation;

public class ValidInputValue {
    private static final int MIN_POS_MENU_VALUE = 1;
    private static final int MAX_POS_MENU_VALUE = 3;
    private static final String WRONG_TABLE_NUMBER_MESSAGE = "테이블 번호는 1,2,3,4,5,6,8번 만 가능합니다";
    private static final String WRONG_POS_NUMBER_MESSAGE = "포스 메뉴는 1,2,3번중 하나 이어야 합니다.";

    public static int checkMenuValue(String posMenuValue) {
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
        if(posMenuNumber < MIN_POS_MENU_VALUE || posMenuNumber > MAX_POS_MENU_VALUE) {
            throw new IllegalArgumentException();
        }
        return posMenuNumber;
    }

    public static int checkTableValue(String tableValue) {
        int tableNumber;
        try {
            tableNumber = checkTableValueRange(tableValue);
        } catch(Exception e) {
            throw new IllegalArgumentException(WRONG_TABLE_NUMBER_MESSAGE);
        }
        return tableNumber;
    }

    private static int checkTableValueRange(String tableValue) {
        int tableNumber = Integer.parseInt(tableValue);
        if(tableNumber == 7 || (tableNumber < 1 || tableNumber > 8)) {
            throw new IllegalArgumentException("테이블 번호는 1,2,3,4,5,6,8번 만 가능합니다");
        }
        return tableNumber;
    }
}
