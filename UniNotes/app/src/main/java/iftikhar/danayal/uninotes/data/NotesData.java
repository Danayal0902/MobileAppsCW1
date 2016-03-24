package iftikhar.danayal.uninotes.data;

import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danayal_94 on 24/03/16.
 */
public class NotesData {

    public List<NoteItem> findAll() {
        List<NoteItem> noteList = new ArrayList<NoteItem>();
        NoteItem note = NoteItem.getNew();
        noteList.add(note);
        return noteList;
    }

    public boolean update(NoteItem note) {
        return true;
    }

    public boolean remove(NoteItem note) {
        return true;
    }
}
