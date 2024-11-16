package design_patterns.proxy;

public interface IDatabase {
    default void connect() {
        System.out.println("Connected to: " + getDbName());
    }
    String getDbName();
}
