package iftikhar.danayal.uninotes.data;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by danayal_94 on 24/03/16.
 */
public class NotesData {
    public static final String PREFERENCE_KEY = "notes";
    private SharedPreferences notesPref;

    public NotesData(Context context) {
        notesPref = context.getSharedPreferences(PREFERENCE_KEY, Context.MODE_PRIVATE);
    }

    public List<NoteItem> findAll() {

        Map<String, ?> notesMap = notesPref.getAll();
        SortedSet<String> keys = new TreeSet<String>(notesMap.keySet());

        List<NoteItem> noteList = new ArrayList<NoteItem>();
        for (String key : keys) {
            NoteItem note = new NoteItem();
            note.setKey(key);
            note.setText((String) notesMap.get(key));
            noteList.add(note);
        }
        return noteList;
    }

    public boolean update(NoteItem note) {
        SharedPreferences.Editor editor = notesPref.edit();
        editor.putString(note.getKey(), note.getText());
        editor.commit();
        return true;
    }

    public boolean remove(NoteItem note) {

        if (notesPref.contains(note.getKey())) {
            SharedPreferences.Editor editor = notesPref.edit();
            editor.remove(note.getKey());
            editor.commit();
        }
        return true;

    }
}
