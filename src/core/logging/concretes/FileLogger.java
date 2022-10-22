package core.logging.concretes;

import core.logging.abstracts.Logger;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı : " + message);
    }


}
