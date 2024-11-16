package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.classLogg(new TestClass(), "Some info");
        logger.classLogg(null, "Some info");
    }
}

/*result:

Log info: 16.11.24 - TestClass - Some info
Log info: 16.11.24 - null - Some info

 */
