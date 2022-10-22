package core.logging.concretes;

import core.logging.abstracts.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Database loglandı : " + message);
    }
}
