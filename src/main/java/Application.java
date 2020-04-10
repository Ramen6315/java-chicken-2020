import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import domain.validation.ValidInputValue;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    // TODO 구현 진행
    public static void main(String[] args) {
        OutputView.printPosMenu();
        OutputView.printSelecPosValue();
        final int posNumber = ValidInputValue.checkMenuValue(InputView.inputPosMenuNumber());
        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables);

//        final int tableNumber = InputView.inputTableNumber();

        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);
    }
}
