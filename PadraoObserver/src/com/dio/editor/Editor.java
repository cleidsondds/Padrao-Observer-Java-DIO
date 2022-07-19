package com.dio.editor;
import java.io.File;
import com.dio.publisher.EventManager;

public class Editor {
    public EventManager events;
    private File file;
    public Editor() {
        this.events = new EventManager("open", "save", "white");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    public void whiteFile() throws Exception {
        if (this.file != null) {
            events.notify("white", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
