package design_patterns.proxy;

public class DatabaseImpl implements IDatabase {

    private final String dbName;

    public DatabaseImpl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String getDbName() {
        return dbName;
    }
}
