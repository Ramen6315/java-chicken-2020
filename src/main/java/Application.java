import domain.*;
import domain.validation.ValidInputValue;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printPosMenu();
        OutputView.printSelecPosValue();
        final List<Table> tables = TableRepository.tables();
        ValidInputValue.checkMenuValue(InputView.inputPosMenuNumber());
        OutputView.printTables(tables);
        final int tableNumber = ValidInputValue.checkTableValue(InputView.inputTableNumber());
        Tables chickenHouseTables = new Tables();

        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);
    }
}
