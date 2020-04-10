package domain;

import java.util.List;

public class Menus {
    private List<Menu> menus;

    public Menus() {
        menus = MenuRepository.menus();
    }
}
