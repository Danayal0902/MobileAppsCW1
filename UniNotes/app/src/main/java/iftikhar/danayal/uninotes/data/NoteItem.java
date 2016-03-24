package iftikhar.danayal.uninotes.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by danayal_94 on 24/03/16.
 */
public class NoteItem {
    private String text;
    private String key;

    public String getKey() {
        return key;
    }

    public void  setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public static NoteItem getNew() {
        Locale locale = new Locale("en_UK");
        Locale.setDefault(locale);
        String format = "dd-MM-yyyy HH:mm:ss Z";
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String key = formatter.format(new Date());

        NoteItem note = new NoteItem();
        note.setKey(key);
        note.setText("");
        return note;
    }
}
