import domain.chickenhouse.Menu;
import domain.chickenhouse.Menus;
import domain.chickenhouse.Table;
import domain.chickenhouse.Tables;
import domain.validation.ValidInputValue;
import view.InputView;
import view.OutputView;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printPosMenu();
        OutputView.printSelectPosValue();
        int posNumber = ValidInputValue.checkPosMenuValue(InputView.inputPosMenuNumber());
        Tables tables = new Tables();
        Menus menus = new Menus();
        while(isOrder(posNumber)) {

            if(isOrder(posNumber)) {
                OutputView.printTables(tables);
                final int tableNumber = ValidInputValue.checkTableValue(InputView.inputTableNumber());
                Table table = tables.chooseTable(tableNumber);
                OutputView.printMenus(menus);
                OutputView.printSelectMenu();
                Menu menu = (ValidInputValue.checkMenuValue(InputView.inputMenuNumber(),menus));
                OutputView.printMenuAmount();
                table.orderMenu(menu, ValidInputValue.checkMenuAmount(InputView.inputMenuAmount()));
            }
            OutputView.printPosMenu();
            OutputView.printSelectPosValue();
            posNumber = ValidInputValue.checkPosMenuValue(InputView.inputPosMenuNumber());
        }

    }
    private static boolean isOrder(int posNumber) {
        return posNumber == 1|| posNumber == 2;
    }
}
