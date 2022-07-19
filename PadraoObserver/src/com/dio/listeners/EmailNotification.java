package com.dio.listeners;
import com.dio.publisher.Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailNotification  implements EventListener {

    private String email;
    public EmailNotification(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("Email para " + email + ": Alguém executou uma operação de " + eventType + " com o seguinte documento: " + file.getName());
    }

}
