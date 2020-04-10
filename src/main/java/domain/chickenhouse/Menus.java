package domain.chickenhouse;

import domain.repository.MenuRepository;

import java.util.Collections;
import java.util.List;

public class Menus {
    private List<Menu> menus;

    public Menus() {
        menus = MenuRepository.menus();
    }

    public Menu selectMenu(int menuNumber) {
        return menus.stream()
                .filter(menu -> menu.isSameMenuNumber(menuNumber))
                .findAny()
                .orElseThrow(IllegalAccessError::new);
    }

    public List<Menu> getMenus() {
        return Collections.unmodifiableList(menus);
    }
}
