package domain;

public class Pos {
    private Tables tables;

    public Pos() {
        tables = createTables();
    }

    private Tables createTables() {
        Tables tables = new Tables();
        return tables;
    }
}
