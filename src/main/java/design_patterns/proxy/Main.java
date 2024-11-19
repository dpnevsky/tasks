package design_patterns.proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("without proxy:");
        IDatabase IDatabaseImpl = new DatabaseImpl("my_db");
        IDatabaseImpl.connect(IDatabaseImpl.getDbName());
        System.out.println("via proxy:");
        IDatabase IDatabaseProxy = new DatabaseProxy(IDatabaseImpl);
        IDatabaseProxy.connect(IDatabaseImpl.getDbName());
    }
}

/*result:

without proxy:
Connected to: my_db
via proxy:
Connected to: localhost:port/my_db

 */
