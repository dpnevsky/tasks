package design_patterns.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

//Создать класс логирования. Метод в нем должен выводить имя переданного класса и дополнительную информацию.
//classLogg(Object obj, String info)
public class Logger {

    private static volatile Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {
        String className = (obj != null) ? obj.getClass().getSimpleName() : "null";
        String timestamp = new SimpleDateFormat("dd.MM.yy").format(new Date());
        System.out.println("Log info: " + timestamp + " - " + className + " - " + info);
    }
}
