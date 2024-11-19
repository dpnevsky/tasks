package design_patterns.proxy;

public interface IDatabase {
    void connect(String dbName);
    String getDbName();
}
