package design_patterns.proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("without proxy:");
        IDatabase IDatabaseImpl = new DatabaseImpl("my_db");
        IDatabaseImpl.connect();
        System.out.println("via proxy:");
        IDatabase IDatabaseProxy = new DatabaseProxy(IDatabaseImpl);
        IDatabaseProxy.connect();
        System.out.println("proxy getDbName():");
        System.out.println(IDatabaseProxy.getDbName());
    }
}

/*result:

without proxy:
Connected to: my_db
via proxy:
Connected to: localhost:port/my_db
proxy getDbName():
localhost:port/my_db

 */
