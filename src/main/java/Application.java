import domain.chickenhouse.Menu;
import domain.chickenhouse.Menus;
import domain.chickenhouse.Table;
import domain.chickenhouse.Tables;
import domain.validation.ValidInputValue;
import view.InputView;
import view.OutputView;

public class Application {

    private static final int CALCULATE_VALUE = 2;
    private static final int ORDER_VALUE = 1;

    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printPosMenu();
        OutputView.printSelectPosValue();
        int posNumber = ValidInputValue.checkPosMenuValue(InputView.inputPosMenuNumber());
        Tables tables = new Tables();
        Menus menus = new Menus();
        while(isOrder(posNumber)) {

            if(isOrderMenu(posNumber)) {
                order(tables, menus);
            }
            if(isCalculate(posNumber)) {
                calculate(tables, menus);
            }

            OutputView.printPosMenu();
            OutputView.printSelectPosValue();
            posNumber = ValidInputValue.checkPosMenuValue(InputView.inputPosMenuNumber());
        }

    }

    private static void calculate(Tables tables, Menus menus) {
        final int tableNumber = ValidInputValue.checkTableValue(InputView.inputTableNumber());
        Table table = tables.chooseTable(tableNumber);
        int bill = table.calculateCreditCard();
    }

    private static boolean isCalculate(int posNumber) {
        return posNumber == CALCULATE_VALUE;
    }

    private static boolean isOrderMenu(int posNumber) {
        return posNumber == ORDER_VALUE;
    }

    private static void order(Tables tables, Menus menus) {
        OutputView.printTables(tables);

        final int tableNumber = ValidInputValue.checkTableValue(InputView.inputTableNumber());
        Table table = tables.chooseTable(tableNumber);

        OutputView.printMenus(menus);
        OutputView.printSelectMenu();

        Menu menu = (ValidInputValue.checkMenuValue(InputView.inputMenuNumber(),menus));

        OutputView.printMenuAmount();

        table.orderMenu(menu, ValidInputValue.checkMenuAmount(InputView.inputMenuAmount()));
    }

    private static boolean isOrder(int posNumber) {
        return isOrderMenu(posNumber) || isCalculate(posNumber);
    }
}
