package domain.validation;

public class ValidInputValue {

    private static final int MIN_POS_MENU_VALUE = 1;
    private static final int MAX_POS_MENU_VALUE = 3;

    public static int checkMenuValue(String posMenuValue) {
        int posMenuNumber;
        try {
            posMenuNumber = checkMenuValueRange(posMenuValue);
        } catch (Exception e) {
            throw new IllegalArgumentException("포스 메뉴는 1,2,3번중 하나 이어야 합니다.");
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
}
