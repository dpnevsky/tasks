package design_patterns.proxy;

//Создание класса который хранит название бд и "подключается" к ней по полному url.
// Подключаться через proxy, который добавляет к названию полный адрес.
// (через proxy обращаюсь к названию бд, вижу строчку подключено localhost:port/название бд)
public class DatabaseProxy implements IDatabase {

    private final IDatabase IDatabase;
    private final String baseUrl = "localhost:port/";

    public DatabaseProxy(IDatabase IDatabase) {
        this.IDatabase = IDatabase;
    }

    @Override
    public String getDbName() {
        return baseUrl + IDatabase.getDbName();
    }
}
