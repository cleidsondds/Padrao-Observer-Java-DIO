package com.dio.listeners;
import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

  //  @Override
    public void update(String eventType, File file) {
        System.out.println("Salvo para o log " + log + ":  " + "Alguém executou uma operação do tipo " + eventType + " com o seguinte documento: observer.txt");
    }
}


