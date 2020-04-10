import domain.Menus;
import domain.Tables;
import domain.validation.ValidInputValue;
import view.InputView;
import view.OutputView;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printPosMenu();
        OutputView.printSelectPosValue();
        Tables tables = new Tables();
        ValidInputValue.checkPosMenuValue(InputView.inputPosMenuNumber());
        OutputView.printTables(tables);
        final int tableNumber = ValidInputValue.checkTableValue(InputView.inputTableNumber());
        Menus menus = new Menus();
        ValidInputValue.checkMenuValue(InputView.inputMenuNumber(), menus);
        OutputView.printMenus(menus);
    }
}
