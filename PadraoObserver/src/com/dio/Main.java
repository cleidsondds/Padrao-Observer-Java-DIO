package com.dio;
import com.dio.editor.Editor;
import com.dio.listeners.EmailNotification;
import com.dio.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
       // editor.events.subscribe("open", new LogOpenListener(""));
      //  editor.events.subscribe("save", new EmailNotification("admin@example.com"));

        try {
            editor.openFile("observer.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}